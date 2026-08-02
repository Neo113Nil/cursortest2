package xsna;

import android.app.Activity;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.vk.im.ui.fragments.chat.ChatFragment;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AttachmentEditorViewer.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class p84 extends FunctionReferenceImpl implements wzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p84(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        Fragment fragment;
        FragmentManager supportFragmentManager;
        List<Fragment> f;
        FragmentManager supportFragmentManager2;
        List<Fragment> f2;
        Object obj3;
        switch (this.b) {
            case 0:
                int intValue = ((Number) obj).intValue();
                Intent intent = (Intent) obj2;
                Activity activity = ((o84) this.receiver).a;
                boolean z = activity instanceof AppCompatActivity;
                Fragment fragment2 = null;
                AppCompatActivity appCompatActivity = z ? (AppCompatActivity) activity : null;
                if (appCompatActivity == null || (supportFragmentManager2 = appCompatActivity.getSupportFragmentManager()) == null || (f2 = supportFragmentManager2.c.f()) == null) {
                    fragment = null;
                } else {
                    Iterator<T> it = f2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj3 = it.next();
                            if (((Fragment) obj3) instanceof ChatFragment) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    fragment = (Fragment) obj3;
                }
                if (fragment != null) {
                    fragment.startActivityForResult(intent, intValue);
                }
                if (fragment == null) {
                    AppCompatActivity appCompatActivity2 = z ? (AppCompatActivity) activity : null;
                    if (appCompatActivity2 != null && (supportFragmentManager = appCompatActivity2.getSupportFragmentManager()) != null && (f = supportFragmentManager.c.f()) != null) {
                        Iterator<T> it2 = f.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                if (((Fragment) next) instanceof rdc0) {
                                    fragment2 = next;
                                }
                            }
                        }
                        fragment2 = fragment2;
                    }
                    if (fragment2 != null) {
                        fragment2.startActivityForResult(intent, intValue);
                    }
                }
                break;
            default:
                f5u f5uVar = (f5u) obj;
                int intValue2 = ((Number) obj2).intValue();
                kih kihVar = (kih) this.receiver;
                int i = kih.O;
                p8u p8uVar = (p8u) kihVar.t;
                if (p8uVar != null) {
                    kihVar.E.i(new s4u(f5uVar, intValue2, p8uVar));
                }
                break;
        }
        return s3q0.a;
    }
}
