package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Looper;
import android.widget.LinearLayout;
import androidx.core.view.b;
import androidx.media3.common.ParserException;
import com.adjust.sdk.Constants;
import com.yandex.go.taxi.order.models.api.status.ActionType;
import com.yandex.go.taxi.order.models.api.status.OrderStatusWindowAction;
import com.yandex.go.taxi.order.models.api.status.OrderStatusWindowButton;
import com.yandex.go.taxi.order.models.api.status.OrderStatusWindowNotification;
import java.util.ArrayList;
import kotlin.collections.builders.SetBuilder;
import org.webrtc.MediaStreamTrack;
import ru.CryptoPro.reprov.array.DerValue;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.floatbuttonholder.FloatButtonHolderLayout;
import ru.yandex.taxi.widget.floatbuttonholder.RotatableFloatButton;

/* loaded from: classes10.dex */
public abstract class eg3 {
    public static AudioManager a;
    public static final int[] b = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, Constants.MINIMAL_ERROR_STATUS_CODE, Constants.MINIMAL_ERROR_STATUS_CODE, 2048};

    public static final RotatableFloatButton a(FloatButtonHolderLayout floatButtonHolderLayout, Runnable runnable) {
        RotatableFloatButton addFloatButton$default = FloatButtonHolderLayout.addFloatButton$default(floatButtonHolderLayout, f1h0.ic_compass_24, runnable, null, null, 12, null);
        addFloatButton$default.setImportantForAccessibility(2);
        addFloatButton$default.setVisibility(8);
        addFloatButton$default.setRippleEnabled(false);
        return addFloatButton$default;
    }

    public static final RotatableFloatButton b(FloatButtonHolderLayout floatButtonHolderLayout, Runnable runnable) {
        floatButtonHolderLayout.setBottomPadding(tje.u(4, floatButtonHolderLayout.getContext()));
        RotatableFloatButton addFloatButton = floatButtonHolderLayout.addFloatButton(null, runnable, 0);
        addFloatButton.setIconTintAttr(xng0.textMain);
        addFloatButton.setContentDescription("");
        b.p(addFloatButton, new at11(0));
        return addFloatButton;
    }

    public static final FloatButtonHolderLayout c(SlideableModalView slideableModalView, int i) {
        FloatButtonHolderLayout floatButtonHolderLayout = new FloatButtonHolderLayout(slideableModalView.getContext(), null, 0, 0, 14, null);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) floatButtonHolderLayout.getLayoutParams();
        int u = tje.u(i, floatButtonHolderLayout.getContext());
        layoutParams.setMarginEnd(u);
        layoutParams.setMarginStart(u);
        SlideableModalView.addViewAboveCard$default(slideableModalView, floatButtonHolderLayout, 8388613, 0, 4, null);
        return floatButtonHolderLayout;
    }

    public static final RotatableFloatButton d(FloatButtonHolderLayout floatButtonHolderLayout, Runnable runnable) {
        Drawable k = bei.k(f1h0.ic_location_fill_24, floatButtonHolderLayout);
        if (xw31.n(floatButtonHolderLayout.getContext())) {
            floatButtonHolderLayout.setRotationY(180.0f);
        }
        RotatableFloatButton addFloatButton$default = FloatButtonHolderLayout.addFloatButton$default(floatButtonHolderLayout, k, runnable, null, 4, null);
        addFloatButton$default.setIconTintAttr(xng0.textMain);
        addFloatButton$default.setContentDescription(addFloatButton$default.getContext().getString(kyh0.select_current_geolocation_description));
        b.p(addFloatButton$default, new ifq0(14, addFloatButton$default));
        return addFloatButton$default;
    }

    public static final RotatableFloatButton e(FloatButtonHolderLayout floatButtonHolderLayout, Runnable runnable, String str) {
        Drawable k = bei.k(f1h0.panorama_icon, floatButtonHolderLayout);
        if (xw31.n(floatButtonHolderLayout.getContext())) {
            floatButtonHolderLayout.setRotationY(180.0f);
        }
        RotatableFloatButton addFloatButton = floatButtonHolderLayout.addFloatButton(k, runnable, 0);
        addFloatButton.setVisibility(8);
        addFloatButton.setContentDescription(str);
        b.p(addFloatButton, new bi(str, 4));
        return addFloatButton;
    }

    public static final boolean f(OrderStatusWindowNotification orderStatusWindowNotification, DriveState driveState) {
        return orderStatusWindowNotification.k.a.isEmpty() || orderStatusWindowNotification.k.contains(driveState);
    }

    public static bu0 g(i6r i6rVar, String str, w030 w030Var) {
        i6rVar.getClass();
        str.getClass();
        w030Var.getClass();
        bu0 bu0Var = new bu0();
        bu0Var.a = str;
        bu0Var.b = w030Var;
        bu0Var.c = i6rVar;
        int i = 2;
        bu0Var.d = new e7g(i6rVar, i);
        e7g e7gVar = new e7g(i6rVar, 3);
        e7g e7gVar2 = new e7g(i6rVar, 8);
        int i2 = 5;
        e7g e7gVar3 = new e7g(i6rVar, i2);
        e7g e7gVar4 = new e7g(i6rVar, 6);
        bu0Var.e = e7gVar4;
        bu0Var.f = n3w.a(new ra70(new dt20(e7gVar, e7gVar2, e7gVar3, e7gVar4, 14)));
        n3w a2 = n3w.a(w030Var);
        e7g e7gVar5 = (e7g) bu0Var.d;
        bu0Var.g = new zi60(e7gVar5, (n3w) bu0Var.f, a2, i);
        e7g e7gVar6 = new e7g(i6rVar, 7);
        e7g e7gVar7 = (e7g) bu0Var.e;
        bu0Var.h = new jpj0(e7gVar5, new mam0(e7gVar6, e7gVar7, i2), a2, 17);
        bu0Var.i = new vfg0(e7gVar5, new e7g(i6rVar, 4), e7gVar7, a2, 23);
        return bu0Var;
    }

    public static void h(int i, ef90 ef90Var) {
        ef90Var.H(7);
        byte[] bArr = ef90Var.a;
        bArr[0] = -84;
        bArr[1] = DerValue.TAG_APPLICATION;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    public static synchronized AudioManager i(Context context) {
        synchronized (eg3.class) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    a = null;
                }
                AudioManager audioManager = a;
                if (audioManager != null) {
                    return audioManager;
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null && myLooper != Looper.getMainLooper()) {
                    cyd cydVar = new cyd();
                    fh4.d().execute(new hc(25, applicationContext, cydVar));
                    cydVar.b();
                    AudioManager audioManager2 = a;
                    audioManager2.getClass();
                    return audioManager2;
                }
                AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                a = audioManager3;
                audioManager3.getClass();
                return audioManager3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final SetBuilder j(OrderStatusWindowAction orderStatusWindowAction) {
        SetBuilder setBuilder = new SetBuilder();
        if (orderStatusWindowAction.a == ActionType.YANDEX_CARD_TOPUP) {
            if (orderStatusWindowAction.f.length() == 0) {
                setBuilder.add("payment method id is empty");
            }
            if (orderStatusWindowAction.g.length() == 0) {
                setBuilder.add("payment method type is empty");
            }
        }
        return setBuilder.b();
    }

    public static final SetBuilder k(OrderStatusWindowNotification orderStatusWindowNotification) {
        SetBuilder setBuilder = new SetBuilder();
        if (orderStatusWindowNotification.f.a.length() == 0) {
            setBuilder.add("primary button text is empty");
        }
        SetBuilder j = j(orderStatusWindowNotification.f.d);
        ArrayList arrayList = new ArrayList(tcc.n(j, 10));
        Object it = j.iterator();
        while (((uf00) it).hasNext()) {
            unr0.B("primary action ", (String) ((sf00) it).next(), arrayList);
        }
        setBuilder.addAll(arrayList);
        OrderStatusWindowButton orderStatusWindowButton = orderStatusWindowNotification.g;
        if (orderStatusWindowButton != null) {
            SetBuilder j2 = j(orderStatusWindowButton.d);
            ArrayList arrayList2 = new ArrayList(tcc.n(j2, 10));
            Object it2 = j2.iterator();
            while (((uf00) it2).hasNext()) {
                arrayList2.add("secondary action " + orderStatusWindowButton);
            }
            setBuilder.addAll(arrayList2);
        }
        return setBuilder.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
    
        if (r9 != 8) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static kb l(df90 df90Var) {
        int i;
        int i2;
        int g = df90Var.g(16);
        int g2 = df90Var.g(16);
        if (g2 == 65535) {
            g2 = df90Var.g(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = g2 + i;
        if (g == 44097) {
            i3 += 2;
        }
        if (df90Var.g(2) == 3) {
            do {
                df90Var.g(2);
            } while (df90Var.f());
        }
        int g3 = df90Var.g(10);
        if (df90Var.f() && df90Var.g(3) > 0) {
            df90Var.o(2);
        }
        int i4 = df90Var.f() ? 48000 : 44100;
        int g4 = df90Var.g(4);
        int[] iArr = b;
        if (i4 == 44100 && g4 == 13) {
            i2 = iArr[g4];
        } else if (i4 != 48000 || g4 >= 14) {
            i2 = 0;
        } else {
            int i5 = iArr[g4];
            int i6 = g3 % 5;
            if (i6 != 1) {
                if (i6 == 2) {
                    if (g4 != 8) {
                    }
                    i2 = i5 + 1;
                } else if (i6 != 3) {
                    if (i6 == 4) {
                        if (g4 != 3) {
                            if (g4 != 8) {
                            }
                        }
                        i2 = i5 + 1;
                    }
                    i2 = i5;
                }
            }
            if (g4 != 3) {
            }
            i2 = i5 + 1;
        }
        return new kb(i4, i3, i2);
    }

    public static void m(df90 df90Var, jb jbVar) {
        int g = df90Var.g(5);
        df90Var.o(2);
        if (df90Var.f()) {
            df90Var.o(5);
        }
        if (g >= 7 && g <= 10) {
            df90Var.n();
        }
        if (df90Var.f()) {
            int g2 = df90Var.g(3);
            if (jbVar.b == -1 && g >= 0 && g <= 15 && (g2 == 0 || g2 == 1)) {
                jbVar.b = g;
            }
            if (df90Var.f()) {
                o(df90Var);
            }
        }
    }

    public static void n(df90 df90Var, jb jbVar) {
        df90Var.o(2);
        boolean f = df90Var.f();
        int g = df90Var.g(8);
        for (int i = 0; i < g; i++) {
            df90Var.o(2);
            if (df90Var.f()) {
                df90Var.o(5);
            }
            if (f) {
                df90Var.o(24);
            } else {
                if (df90Var.f()) {
                    if (!df90Var.f()) {
                        df90Var.o(4);
                    }
                    jbVar.c = df90Var.g(6) + 1;
                }
                df90Var.o(4);
            }
        }
        if (df90Var.f()) {
            df90Var.o(3);
            if (df90Var.f()) {
                o(df90Var);
            }
        }
    }

    public static void o(df90 df90Var) {
        int g = df90Var.g(6);
        if (g < 2 || g > 42) {
            throw ParserException.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(g)));
        }
        df90Var.o(g * 8);
    }
}
