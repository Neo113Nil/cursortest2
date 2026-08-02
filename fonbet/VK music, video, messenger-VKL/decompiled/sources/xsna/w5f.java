package xsna;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import xsna.ajh0;
import xsna.d3f;

/* compiled from: ClipsSuggestsDelegate.kt */
/* loaded from: classes16.dex */
public final class w5f implements y5f, lvu, l420, d3f.a {
    public final g28 b;
    public final y34 c;
    public final fj1 d;
    public final evu e;
    public final q420 f;
    public final efe g;
    public final g420 h;
    public final HashMap<UserId, String> i;
    public final io.reactivex.rxjava3.disposables.c j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsSuggestsDelegate.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a HASHTAG;
        public static final a MENTION;

        static {
            a aVar = new a("MENTION", 0);
            MENTION = aVar;
            a aVar2 = new a("HASHTAG", 1);
            HASHTAG = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: ClipsSuggestsDelegate.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.MENTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.HASHTAG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public w5f(g28 g28Var, vkb vkbVar, o9 o9Var, y34 y34Var) {
        this.b = g28Var;
        this.c = y34Var;
        x5f x5fVar = x5f.b;
        this.d = new fj1(12);
        g28Var.getContext();
        this.e = new evu(g28Var, this, new q6x(), null);
        Context context = g28Var.getContext();
        x5fVar.getClass();
        q420 q420Var = new q420(g28Var, this, new pil(context), null, false);
        q420Var.o = true;
        q420Var.g = new hr80();
        this.f = q420Var;
        this.g = (efe) vkbVar.invoke(this);
        this.h = (g420) o9Var.invoke(this);
        this.i = new HashMap<>();
        g28Var.addTextChangedListener(q420Var);
        Pattern pattern = n420.a;
        String text = g28Var.getText();
        List<vg6> a2 = n420.a(text == null ? "" : text);
        if (a2 != null) {
            for (vg6 vg6Var : a2) {
                if (vg6Var instanceof pgq0) {
                    this.i.put(((pgq0) vg6Var).d, vg6Var.c);
                }
            }
        }
        this.h.c();
        this.b.setSelectionChangeListener(this);
        int i = 17;
        this.j = new io.reactivex.rxjava3.internal.operators.mixed.o(this.e.h.w0(200L, TimeUnit.MILLISECONDS), new r41(new ve0(i), i)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new t00(new t40(this, 26), i), new j22(new pl2(13), 15));
    }

    @Override // xsna.y5f
    public final void A5() {
        q420 q420Var = this.f;
        q420Var.e(true);
        q420Var.e(false);
    }

    @Override // xsna.f420
    public final void D0(b420 b420Var) {
        String str = (String) this.d.invoke(b420Var);
        g28 g28Var = this.b;
        g28Var.setSelectionChangeListener(null);
        UserId userId = b420Var.a;
        this.f.Q(userId, str, true);
        g28Var.setSelectionChangeListener(this);
        this.h.hide();
        this.i.put(userId, str);
    }

    @Override // xsna.y5f
    public final View I1(ViewGroup viewGroup) {
        return this.g.a((mqd) viewGroup);
    }

    @Override // xsna.l420
    public final void Y0() {
        this.h.hide();
    }

    @Override // xsna.d3f.a
    public final void b(int i, int i2) {
        if (i != i2) {
            return;
        }
        this.f.d(i);
        this.e.e(i);
    }

    @Override // xsna.dfe
    public final void c(o5f o5fVar) {
        String str = o5fVar.a;
        g28 g28Var = this.b;
        g28Var.setSelectionChangeListener(null);
        this.e.a(null, null, str);
        g28Var.setSelectionChangeListener(this);
        Editable text = g28Var.getText();
        if (text != null) {
            text.insert(text.length(), " ");
        }
        if (o5fVar.b) {
            v5f v5fVar = v5f.a;
            zih0 zih0Var = (zih0) this.c.c;
            if (v5fVar == null) {
                throw new NoWhenBranchMatchedException();
            }
            zih0Var.a(ajh0.a.a);
        }
    }

    @Override // xsna.lvu
    public final void d(qux0 qux0Var, qux0 qux0Var2) {
        CharSequence text = this.b.getText();
        if (text == null) {
            text = "";
        }
        if (qux0Var != null) {
            if ((qux0Var2 == null || qux0Var.a != qux0Var2.a) && qux0Var.b <= text.length()) {
                f(text, qux0Var);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a A[SYNTHETIC] */
    @Override // xsna.y5f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d0() {
        qux0 qux0Var;
        Editable text;
        int c;
        int b2;
        Editable text2 = this.b.getText();
        if (text2 == null) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (i < text2.length()) {
            int i3 = i2 + 1;
            if (text2.charAt(i) == '#' && i2 < text2.length() - 1) {
                evu evuVar = this.e;
                evuVar.getClass();
                try {
                    text = evuVar.a.getText();
                    c = evuVar.c(i3, text);
                    b2 = evuVar.b(i3, text);
                } catch (Throwable th) {
                    L.g("Can't calculate hashtag position", th);
                }
                if (c >= 0 && c <= b2) {
                    int min = Math.min(b2 + 1, text.length());
                    qux0Var = new qux0(c, min, text.subSequence(c, min));
                    if (qux0Var == null) {
                        f(text2, qux0Var);
                    }
                }
                qux0Var = null;
                if (qux0Var == null) {
                }
            }
            i++;
            i2 = i3;
        }
    }

    @Override // xsna.y5f
    public final String d6() {
        return this.f.b();
    }

    public final void e(a aVar) {
        int i = b.$EnumSwitchMapping$0[aVar.ordinal()];
        if (i == 1) {
            this.g.hide();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.h.hide();
        }
    }

    public final void f(CharSequence charSequence, qux0 qux0Var) {
        int i = qux0Var.a;
        int i2 = qux0Var.b;
        CharSequence subSequence = charSequence.subSequence(i, i2);
        evu evuVar = this.e;
        if (evuVar.d(subSequence)) {
            String obj = subSequence.toString();
            Integer valueOf = Integer.valueOf(qux0Var.a);
            Integer valueOf2 = Integer.valueOf(i2);
            g28 g28Var = this.b;
            g28Var.setSelectionChangeListener(null);
            evuVar.a(valueOf, valueOf2, obj);
            g28Var.setSelectionChangeListener(this);
        }
    }

    @Override // xsna.y5f
    public final void onDestroy() {
        this.h.onDestroyView();
        io.reactivex.rxjava3.disposables.c cVar = this.j;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // xsna.l420
    public final void x0(String str) {
        e(a.MENTION);
        this.h.j(str);
    }

    @Override // xsna.f420
    public final void S1() {
    }

    @Override // xsna.f420
    public final void e0() {
    }

    @Override // xsna.l420
    public final void N3(UserId userId) {
    }

    @Override // xsna.f420
    public final void s5(Attachment attachment) {
    }

    @Override // xsna.f420
    public final void v5(Throwable th) {
    }

    @Override // xsna.f420
    public final void x4(boolean z) {
    }
}
