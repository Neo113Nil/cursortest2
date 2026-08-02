package ru.mail.libverify.l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import ru.mail.libverify.i.j;
import ru.mail.libverify.j0.l;
import ru.mail.libverify.n0.e;
import ru.mail.verify.core.utils.Gsonable;
import xsna.jax0;
import xsna.n6j;
import xsna.xy9;

/* loaded from: classes9.dex */
public class c implements Gsonable, l {

    @NonNull
    public final b action;

    @Nullable
    public final String appCheckParams;
    public final int blockTimeoutSec;

    @Nullable
    public final String checkParams;

    @Nullable
    public final String from;

    @Nullable
    public final ArrayList<ru.mail.libverify.d.b> mobileIdRoutes;

    @Nullable
    public String phone;

    @NonNull
    public final a policy;

    @Nullable
    public j pushPermissions;

    @Nullable
    public final String pushToken;

    @Nullable
    public final String sessionId;

    @Nullable
    public final String smsParams;

    private c(@NonNull b bVar, @NonNull a aVar, @Nullable String str, int i, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.phone = null;
        this.pushPermissions = null;
        this.action = bVar;
        this.policy = aVar;
        this.from = str;
        this.blockTimeoutSec = i;
        this.checkParams = str2;
        this.smsParams = str3;
        this.appCheckParams = str4;
        this.pushToken = str5;
        this.mobileIdRoutes = null;
        this.sessionId = str6;
    }

    @NonNull
    public static c a(@NonNull c cVar, @NonNull ArrayList arrayList) {
        ru.mail.libverify.d.b bVar = (ru.mail.libverify.d.b) xy9.b(1, arrayList);
        if (bVar != null) {
            arrayList.add(new ru.mail.libverify.d.b(bVar.a(), -2));
        }
        String str = cVar.sessionId;
        Objects.requireNonNull(str);
        return new c((ArrayList<ru.mail.libverify.d.b>) arrayList, str, cVar.pushToken, b.MOBILE_ID);
    }

    @NonNull
    public static c b(@NonNull String str, @Nullable String str2) {
        return new c(b.CHECK, a.NOTHING, null, 0, str, null, null, str2, null);
    }

    @NonNull
    public static c c(@NonNull String str, @Nullable String str2, @Nullable String str3) {
        return new c(b.CHECK, a.NOTHING, null, 0, str, str2, null, str3, null);
    }

    @Override // ru.mail.libverify.j0.l
    @NonNull
    public final String getId() {
        Locale locale = Locale.US;
        b bVar = this.action;
        String str = this.from;
        int i = this.blockTimeoutSec;
        String str2 = this.checkParams;
        String str3 = this.smsParams;
        a aVar = this.policy;
        String str4 = this.appCheckParams;
        String e = str4 == null ? null : e.e(str4);
        String str5 = this.pushToken;
        ArrayList<ru.mail.libverify.d.b> arrayList = this.mobileIdRoutes;
        Integer valueOf = arrayList != null ? Integer.valueOf(arrayList.size()) : null;
        String str6 = this.sessionId;
        StringBuilder sb = new StringBuilder("update_");
        sb.append(bVar);
        sb.append(BundleUtil.UNDERLINE_TAG);
        sb.append(str);
        sb.append(BundleUtil.UNDERLINE_TAG);
        jax0.a(i, BundleUtil.UNDERLINE_TAG, str2, BundleUtil.UNDERLINE_TAG, sb);
        sb.append(str3);
        sb.append(BundleUtil.UNDERLINE_TAG);
        sb.append(aVar);
        sb.append(BundleUtil.UNDERLINE_TAG);
        n6j.b(sb, e, BundleUtil.UNDERLINE_TAG, str5, BundleUtil.UNDERLINE_TAG);
        sb.append(valueOf);
        sb.append(BundleUtil.UNDERLINE_TAG);
        sb.append(str6);
        return sb.toString();
    }

    @NonNull
    public static c b(@NonNull String str, @NonNull String str2, @Nullable String str3) {
        return new c(str, str2, str3, b.CALLIN_CLICK);
    }

    @NonNull
    public static c c(@NonNull String str, @Nullable String str2) {
        return new c(b.REPORT_SPAM, a.NOTHING, str, 0, null, null, null, str2, null);
    }

    @NonNull
    public static c a(@Nullable String str) {
        return new c(b.NO_ACTION, a.NOTHING, str);
    }

    @NonNull
    public static c a(@NonNull j jVar) {
        return new c(jVar);
    }

    @NonNull
    public static c a(@NonNull b bVar, @Nullable String str) {
        return new c(bVar, a.NOTHING, str);
    }

    @NonNull
    public static c a(@NonNull b bVar, @Nullable String str, @Nullable j jVar) {
        return new c(bVar, a.NOTHING, str, jVar);
    }

    @NonNull
    public static c a(@NonNull b bVar, @NonNull a aVar, @Nullable String str) {
        return new c(bVar, aVar, str);
    }

    @NonNull
    public static c a(@NonNull String str, @Nullable String str2) {
        return new c(b.NO_ACTION, a.NOTHING, null, 0, null, null, str, str2, null);
    }

    private c(@NonNull b bVar, @NonNull a aVar, @Nullable String str) {
        this.phone = null;
        this.pushPermissions = null;
        this.action = bVar;
        this.policy = aVar;
        this.from = null;
        this.blockTimeoutSec = 0;
        this.checkParams = null;
        this.smsParams = null;
        this.appCheckParams = null;
        this.pushToken = str;
        this.mobileIdRoutes = null;
        this.sessionId = null;
    }

    @NonNull
    public static c a(@NonNull String str, int i, @Nullable String str2) {
        return new c(b.BLOCK, a.NOTHING, str, i, null, null, null, str2, null);
    }

    @NonNull
    public static c a(@NonNull ArrayList<ru.mail.libverify.d.b> arrayList, @NonNull String str, @Nullable String str2) {
        return new c(arrayList, str, str2, b.MOBILE_ID);
    }

    @NonNull
    public static c a(@NonNull String str, @NonNull String str2, @Nullable String str3) {
        return new c(str, str2, str3, b.CALLIN_CALL);
    }

    private c(@NonNull b bVar, @NonNull a aVar, @Nullable String str, @Nullable j jVar) {
        this.phone = null;
        this.action = bVar;
        this.policy = aVar;
        this.from = null;
        this.blockTimeoutSec = 0;
        this.checkParams = null;
        this.smsParams = null;
        this.appCheckParams = null;
        this.pushToken = str;
        this.mobileIdRoutes = null;
        this.sessionId = null;
        this.pushPermissions = jVar;
    }

    private c(@NonNull ArrayList<ru.mail.libverify.d.b> arrayList, @NonNull String str, @Nullable String str2, @NonNull b bVar) {
        this.phone = null;
        this.pushPermissions = null;
        this.action = bVar;
        this.policy = a.NOTHING;
        this.from = null;
        this.blockTimeoutSec = 0;
        this.checkParams = null;
        this.smsParams = null;
        this.appCheckParams = null;
        this.pushToken = str2;
        this.mobileIdRoutes = arrayList;
        this.sessionId = str;
    }

    private c(@NonNull String str, @NonNull String str2, @Nullable String str3, @NonNull b bVar) {
        this.phone = null;
        this.pushPermissions = null;
        this.action = bVar;
        this.policy = a.NOTHING;
        this.from = null;
        this.blockTimeoutSec = 0;
        this.checkParams = null;
        this.smsParams = null;
        this.appCheckParams = null;
        this.pushToken = str3;
        this.mobileIdRoutes = null;
        this.sessionId = str2;
        this.phone = str;
    }

    private c(@NonNull j jVar) {
        this.phone = null;
        this.pushPermissions = null;
        this.action = b.NO_ACTION;
        this.policy = a.NOTHING;
        this.from = null;
        this.blockTimeoutSec = 0;
        this.checkParams = null;
        this.smsParams = null;
        this.appCheckParams = null;
        this.pushToken = null;
        this.mobileIdRoutes = null;
        this.sessionId = null;
        this.pushPermissions = jVar;
    }

    private c() {
        this.phone = null;
        this.pushPermissions = null;
        this.action = b.NO_ACTION;
        this.policy = a.NOTHING;
        this.from = null;
        this.blockTimeoutSec = 0;
        this.checkParams = null;
        this.smsParams = null;
        this.appCheckParams = null;
        this.pushToken = null;
        this.mobileIdRoutes = null;
        this.sessionId = null;
    }
}
