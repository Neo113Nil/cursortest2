package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.im.engine.internal.storage.delegates.channels.ChannelsDb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class bjb implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bjb(long j, Float f, jgz jgzVar) {
        this.d = f;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ChannelsDb channelsDb = ((gkb) this.d).b;
                channelsDb.b.b().execSQL(xqm0.g("\n            UPDATE " + channelsDb.a.a + " \n            SET " + ChannelsDb.Column.IS_SUGGESTED + " = 0 \n            WHERE " + ChannelsDb.Column.ID.getKey() + " = " + this.c + "\n            "));
                return s3q0.a;
            default:
                Float f = (Float) this.d;
                kw8 kw8Var = (kw8) obj;
                Float.intBitsToFloat((int) (kw8Var.b.d() & 4294967295L));
                swe0.f(f.floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat((int) (kw8Var.b.d() & 4294967295L)));
                throw null;
        }
    }

    public /* synthetic */ bjb(gkb gkbVar, long j) {
        this.d = gkbVar;
        this.c = j;
    }
}
