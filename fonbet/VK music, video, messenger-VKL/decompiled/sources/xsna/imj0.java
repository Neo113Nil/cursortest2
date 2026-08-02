package xsna;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import androidx.appcompat.app.AppCompatActivity;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.dto.common.Peer;
import com.vk.dto.user.InvisibleStatus;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.UserSex;
import com.vk.dto.user.VisibleStatus;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.push.common.HostInfoProvider;
import com.vkontakte.android.MainActivity;
import com.vkontakte.android.R;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.TimeUnit;
import xsna.mto0;

/* compiled from: SignalBlockTransformer.kt */
/* loaded from: classes16.dex */
public final class imj0 implements HostInfoProvider {
    public static final jai b = new jai(1245715148, new ndi(0), false);
    public static final jai c = new jai(-675664975, new f6g(0, 1), false);
    public static final jai d = new jai(-710216692, new bv4(0, 1), false);
    public static final StackTraceElement[] e = new StackTraceElement[0];

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, C.UTF8_NAME);
        } catch (UnsupportedEncodingException e2) {
            throw new Error(e2);
        }
    }

    public static byte[] b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(C.UTF8_NAME);
        } catch (UnsupportedEncodingException e2) {
            throw new Error(e2);
        }
    }

    public static final String c(gp80 gp80Var, Peer peer, ProfilesInfo profilesInfo) {
        qtd0 Bb = profilesInfo.Bb(peer);
        if (Bb == null) {
            return "";
        }
        String c2 = gp80Var.c(Bb.B2() == UserSex.FEMALE, Bb.mb());
        return c2 == null ? "" : c2;
    }

    public static final String d(gp80 gp80Var, qtd0 qtd0Var) {
        if (qtd0Var == null) {
            return "";
        }
        String c2 = gp80Var.c(qtd0Var.B2() == UserSex.FEMALE, qtd0Var.mb());
        return c2 == null ? "" : c2;
    }

    public static final void e(gp80 gp80Var, qtd0 qtd0Var, StringBuffer stringBuffer) {
        boolean z = qtd0Var.B2() == UserSex.FEMALE;
        OnlineInfo mb = qtd0Var.mb();
        Context context = e43.a;
        Long l = null;
        if (context == null) {
            context = null;
        }
        xuo0.a.getClass();
        long a = xuo0.a();
        if (mb instanceof InvisibleStatus) {
            stringBuffer.setLength(0);
            stringBuffer.append(gp80Var.d(z, ((InvisibleStatus) mb).b));
            return;
        }
        VisibleStatus zb = mb.zb();
        if (zb == null) {
            return;
        }
        boolean z2 = zb.c;
        if (z2) {
            l = Long.valueOf(a);
        } else {
            long j = zb.b;
            if (j != 0) {
                l = !z2 ? Long.valueOf(j) : Long.valueOf(a);
            }
        }
        if (l == null) {
            stringBuffer.setLength(0);
            return;
        }
        stringBuffer.setLength(0);
        if (a - l.longValue() < TimeUnit.MINUTES.toMillis(1L)) {
            if (zb.Cb()) {
                stringBuffer.append(context.getString(R.string.vkme_online));
                return;
            } else {
                stringBuffer.append(context.getString(R.string.online));
                return;
            }
        }
        if (z) {
            stringBuffer.append(context.getString(R.string.last_seen_female));
        } else {
            stringBuffer.append(context.getString(R.string.last_seen_male));
        }
        stringBuffer.append(' ');
        mto0 mto0Var = gp80Var.g;
        long longValue = l.longValue();
        mto0Var.getClass();
        mto0.a(longValue, stringBuffer, mto0.a.c.g);
        stringBuffer.append(' ');
        stringBuffer.append(context.getString(R.string.last_seen_ago));
    }

    public static final jvu0 f(Cursor cursor) {
        return new jvu0(cursor.getInt(cursor.getColumnIndexOrThrow("id")), cursor.getString(cursor.getColumnIndexOrThrow("event_type_id")), cursor.getString(cursor.getColumnIndexOrThrow("schema_version")), cursor.getLong(cursor.getColumnIndexOrThrow("user_id")), cursor.getString(cursor.getColumnIndexOrThrow("eventJson")), cursor.getInt(cursor.getColumnIndexOrThrow("size")));
    }

    public static void h(Intent intent, AppCompatActivity appCompatActivity) {
        String stringExtra;
        String stringExtra2;
        z4g.d().C();
        if (intent.hasExtra("stat_key")) {
            ui70.L(z4g.d(), "open", intent.getStringExtra("push_type_key"), intent.getStringExtra("stat_key"), null, String.valueOf(o25.a().c().b), null, 104);
        }
        if (intent.hasExtra("stat_key") && intent.hasExtra("track_interaction_key") && (stringExtra2 = intent.getStringExtra("stat_key")) != null) {
            hg1.h(rsg0.y0(new sm4(stringExtra2, "open"), null, null, 3), new kpr(21));
        }
        if (!intent.hasExtra("push_type_key") || (stringExtra = intent.getStringExtra("push_type_key")) == null) {
            return;
        }
        z4g.d().o(appCompatActivity, stringExtra);
    }

    public static void i(Intent intent, MainActivity mainActivity) {
        if (intent.hasExtra("from_push")) {
            h(intent, mainActivity);
        }
    }

    public static int j(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return str.getBytes(C.UTF8_NAME).length;
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException();
        }
    }

    public String g(int i) {
        return uqm0.i(i, R.plurals.vkim_channel_subscribers_count, R.string.vkim_channel_subscribers_count_formatted, true);
    }

    @Override // com.vk.push.common.HostInfoProvider
    public String getHost() {
        return "vkpns-topics.rustore.ru";
    }

    @Override // com.vk.push.common.HostInfoProvider
    public Integer getPort() {
        return HostInfoProvider.DefaultImpls.getPort(this);
    }

    @Override // com.vk.push.common.HostInfoProvider
    public String getScheme() {
        return HttpRequest.DEFAULT_SCHEME;
    }
}
