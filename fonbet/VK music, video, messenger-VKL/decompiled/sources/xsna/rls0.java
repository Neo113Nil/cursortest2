package xsna;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.view.View;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.auth.api.models.AuthResult;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListLargeVh;
import com.vk.log.L;
import com.vk.voip.ui.scheduled.callslist.VoipScheduledCallsFragment;
import com.vkontakte.android.NetworkStateReceiver;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.UUID;
import xsna.ext;
import xsna.y5j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class rls0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rls0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String g0;
        StringBuilder sb;
        int i = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((uls0) obj3).c = true;
                ((k00) obj2).invoke(Boolean.TRUE);
                return s3q0.a;
            case 1:
                return VideoItemListLargeVh.e((VideoItemListLargeVh) obj3, (View) obj2, (qs80) obj);
            case 2:
                js00 js00Var = (js00) obj2;
                dts0 dts0Var = (dts0) obj;
                ((bts0) obj3).g = dts0Var;
                if (dts0Var != null) {
                    js00Var.invoke(dts0Var);
                }
                return s3q0.a;
            case 3:
                ext.b bVar = (ext.b) obj;
                ((pcu0) obj3).q(AuthResult.a((AuthResult) obj2, null, null, null, null, System.currentTimeMillis(), null, null, 8355839), bVar);
                NetworkStateReceiver.c(bVar, true);
                return s3q0.a;
            case 4:
                q5j q5jVar = (q5j) obj;
                jor0.a(q5jVar.d, (y5j.b) obj3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                jcv.b(q5jVar.e, (y5j.a) obj2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                jor0.a(q5jVar.f, q5jVar.c.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                return s3q0.a;
            case 5:
                ArrayList arrayList = (ArrayList) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                Cursor rawQuery = sQLiteDatabase.rawQuery((String) obj3, null);
                int i2 = 9;
                try {
                    try {
                    } catch (SQLiteException e) {
                        L.g("VkDBStorage", e);
                        rawQuery.close();
                        if (!arrayList.isEmpty()) {
                            g0 = j5g.g0(arrayList, StringUtils.COMMA, null, null, 0, new ubj0(i2), 30);
                            sb = new StringBuilder("\n                    UPDATE vk_stat_events\n                    SET uuid='");
                        }
                    }
                    if (!rawQuery.moveToFirst()) {
                        s3q0 s3q0Var = s3q0.a;
                    }
                    while (!rawQuery.isAfterLast()) {
                        arrayList.add(imj0.f(rawQuery));
                        rawQuery.moveToNext();
                    }
                    rawQuery.close();
                    if (!arrayList.isEmpty()) {
                        g0 = j5g.g0(arrayList, StringUtils.COMMA, null, null, 0, new ubj0(i2), 30);
                        sb = new StringBuilder("\n                    UPDATE vk_stat_events\n                    SET uuid='");
                        sb.append(UUID.randomUUID());
                        sb.append("',\n                        sentStatus='PENDING_ON_SEND' \n                    WHERE id IN (");
                        sb.append(g0);
                        sb.append(")\n                    ");
                        sQLiteDatabase.execSQL(sb.toString());
                    }
                    return s3q0.a;
                } finally {
                    rawQuery.close();
                    if (!arrayList.isEmpty()) {
                        sQLiteDatabase.execSQL("\n                    UPDATE vk_stat_events\n                    SET uuid='" + UUID.randomUUID() + "',\n                        sentStatus='PENDING_ON_SEND' \n                    WHERE id IN (" + j5g.g0(arrayList, StringUtils.COMMA, null, null, 0, new ubj0(i2), 30) + ")\n                    ");
                    }
                }
            default:
                int i3 = VoipScheduledCallsFragment.c0;
                ((TextView) obj3).setText(j03.g(((VoipScheduledCallsFragment) obj2).mo2getContext(), (Throwable) obj, R.string.error));
                return s3q0.a;
        }
    }
}
