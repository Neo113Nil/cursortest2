package androidx.core.app;

import android.app.Notification;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.app.t;
import androidx.core.graphics.drawable.IconCompat;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.ny61;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class h0 extends t.g {
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final x0 g;
    public String h;
    public Boolean i;

    public h0(x0 x0Var) {
        if (TextUtils.isEmpty(x0Var.a)) {
            ny61.g("User's name must not be empty.");
            throw null;
        }
        this.g = x0Var;
    }

    @Override // androidx.core.app.t.g
    public final void a(Bundle bundle) {
        Bundle bundle2;
        super.a(bundle);
        x0 x0Var = this.g;
        bundle.putCharSequence("android.selfDisplayName", x0Var.a);
        Bundle bundle3 = new Bundle();
        bundle3.putCharSequence("name", x0Var.a);
        IconCompat iconCompat = x0Var.b;
        if (iconCompat != null) {
            bundle2 = new Bundle();
            switch (iconCompat.a) {
                case -1:
                    bundle2.putParcelable("obj", (Parcelable) iconCompat.b);
                    break;
                case 0:
                default:
                    ny61.g("Invalid icon");
                    return;
                case 1:
                case 5:
                    bundle2.putParcelable("obj", (Bitmap) iconCompat.b);
                    break;
                case 2:
                case 4:
                case 6:
                    bundle2.putString("obj", (String) iconCompat.b);
                    break;
                case 3:
                    bundle2.putByteArray("obj", (byte[]) iconCompat.b);
                    break;
            }
            bundle2.putInt("type", iconCompat.a);
            bundle2.putInt("int1", iconCompat.e);
            bundle2.putInt("int2", iconCompat.f);
            bundle2.putString("string1", iconCompat.j);
            ColorStateList colorStateList = iconCompat.g;
            if (colorStateList != null) {
                bundle2.putParcelable("tint_list", colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.h;
            if (mode != IconCompat.k) {
                bundle2.putString("tint_mode", mode.name());
            }
        } else {
            bundle2 = null;
        }
        bundle3.putBundle("icon", bundle2);
        bundle3.putString(LaunchBrowserActivity.KEY_URI, x0Var.c);
        bundle3.putString("key", x0Var.d);
        bundle3.putBoolean("isBot", x0Var.e);
        bundle3.putBoolean("isImportant", x0Var.f);
        bundle.putBundle("android.messagingStyleUser", bundle3);
        bundle.putCharSequence("android.hiddenConversationTitle", this.h);
        if (this.h != null && this.i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.h);
        }
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", g0.a(arrayList));
        }
        ArrayList arrayList2 = this.f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", g0.a(arrayList2));
        }
        Boolean bool = this.i;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    @Override // androidx.core.app.t.g
    public final void b(m0 m0Var) {
        v vVar = this.a;
        boolean z = false;
        if (vVar == null || vVar.a.getApplicationInfo().targetSdkVersion >= 28 || this.i != null) {
            Boolean bool = this.i;
            if (bool != null) {
                z = bool.booleanValue();
            }
        } else if (this.h != null) {
            z = true;
        }
        f(z);
        Notification.MessagingStyle a = d0.a(this.g.a());
        Iterator it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            g0 g0Var = (g0) it.next();
            x0 x0Var = g0Var.c;
            Notification.MessagingStyle.Message b = f0.b(g0Var.a, g0Var.b, x0Var != null ? x0Var.a() : null);
            String str = g0Var.e;
            if (str != null) {
                e0.a(b, str, g0Var.f);
            }
            b0.a(a, b);
        }
        Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            g0 g0Var2 = (g0) it2.next();
            x0 x0Var2 = g0Var2.c;
            Notification.MessagingStyle.Message b2 = f0.b(g0Var2.a, g0Var2.b, x0Var2 == null ? null : x0Var2.a());
            String str2 = g0Var2.e;
            if (str2 != null) {
                e0.a(b2, str2, g0Var2.f);
            }
            c0.a(a, b2);
        }
        this.i.getClass();
        b0.b(a, this.h);
        d0.b(a, this.i.booleanValue());
        a.setBuilder(m0Var.b);
    }

    @Override // androidx.core.app.t.g
    public final String c() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    public final void e(g0 g0Var) {
        ArrayList arrayList = this.e;
        arrayList.add(g0Var);
        if (arrayList.size() > 25) {
            arrayList.remove(0);
        }
    }

    public final void f(boolean z) {
        this.i = Boolean.valueOf(z);
    }
}
