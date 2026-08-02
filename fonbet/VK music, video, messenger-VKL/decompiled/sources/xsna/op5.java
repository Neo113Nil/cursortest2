package xsna;

import android.graphics.Matrix;
import android.graphics.Path;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.newsfeed.Owner;
import com.vk.im.ui.fragments.MsgViewFragment;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Stack;

/* compiled from: AvatarApiExtensions.kt */
/* loaded from: classes15.dex */
public class op5 implements pjw, az1 {
    public final Object b;

    public static CharSequence j(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public void a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(j(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.b);
                    sb.append(j(it.next()));
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // xsna.az1
    public AppCompatEditText b() {
        return ((xcm0) this.b).e.getEditText();
    }

    public void c(Path path) {
        ArrayList arrayList = (ArrayList) this.b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arp0 arp0Var = (arp0) arrayList.get(size);
            Matrix matrix = b3r0.a;
            if (arp0Var != null && !arp0Var.a) {
                b3r0.a(path, arp0Var.d.m() / 100.0f, arp0Var.e.m() / 100.0f, arp0Var.f.m() / 360.0f);
            }
        }
    }

    public void d(FragmentActivity fragmentActivity) {
        Stack stack = (Stack) this.b;
        if (stack.isEmpty()) {
            return;
        }
        ((dw20) stack.pop()).dismiss();
        if (stack.isEmpty()) {
            return;
        }
        ((dw20) stack.peek()).Td(fragmentActivity.getSupportFragmentManager(), "filter_dialog_level_" + stack.size());
    }

    public void e(FragmentActivity fragmentActivity, dw20 dw20Var) {
        Stack stack = (Stack) this.b;
        if (!stack.isEmpty()) {
            ((dw20) stack.peek()).dismiss();
        }
        stack.push(dw20Var);
        dw20Var.Td(fragmentActivity.getSupportFragmentManager(), "filter_dialog_level_" + stack.size());
    }

    @Override // xsna.pjw
    public String f(int i) {
        String str;
        ImageSize Cb;
        Owner owner = (Owner) this.b;
        if (i > 0) {
            if ((owner != null ? owner.g : null) != null) {
                Image image = owner.g;
                if (image == null || (Cb = image.Cb(i, true, false)) == null) {
                    return null;
                }
                return Cb.d.d;
            }
        }
        if (owner != null && (str = owner.e) != null) {
            return str;
        }
        if (owner != null) {
            return owner.d;
        }
        return null;
    }

    public void g(FragmentActivity fragmentActivity) {
        Stack stack = (Stack) this.b;
        if (stack.isEmpty()) {
            return;
        }
        ((dw20) stack.peek()).dismiss();
        while (stack.size() > 1) {
            stack.pop();
        }
        ((dw20) stack.peek()).Td(fragmentActivity.getSupportFragmentManager(), "filter_dialog_level_" + stack.size());
    }

    public void h() {
        ((MsgViewFragment) this.b).finish();
    }

    public void i() {
        Stack stack = (Stack) this.b;
        if (!stack.isEmpty()) {
            ((dw20) stack.peek()).dismiss();
        }
        stack.clear();
    }

    public op5(int i, boolean z) {
        switch (i) {
            case 2:
                this.b = new Stack();
                break;
            default:
                this.b = new ArrayList();
                break;
        }
    }

    public op5(String str) {
        str.getClass();
        this.b = str;
    }

    public op5(int i) {
        this.b = new io.reactivex.rxjava3.subjects.f();
    }
}
