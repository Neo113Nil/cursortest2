package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.im.engine.internal.storage.delegates.channels.ChannelsDb;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class sjb implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sjb(Object obj, long j, int i) {
        this.b = i;
        this.d = obj;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ChannelsDb channelsDb = ((gkb) this.d).b;
                int i = ((bdb) obj).c;
                StringBuilder sb = new StringBuilder("\n                UPDATE ");
                sb.append(channelsDb.a.a);
                sb.append(" \n                SET ");
                sr.c(ChannelsDb.Column.LAST_MSG_CNV_ID, sb, " = ? \n                WHERE ");
                channelsDb.b.b().execSQL(bo.d(ChannelsDb.Column.ID, sb, " = ?\n            "), new Object[]{Integer.valueOf(i), Long.valueOf(this.c)});
                return s3q0.a;
            default:
                List list = (List) this.d;
                oio oioVar = (oio) obj;
                float intBitsToFloat = Float.intBitsToFloat((int) (oioVar.d() >> 32)) * 0.25f;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (oioVar.d() >> 32)) * 0.125f;
                float intBitsToFloat3 = Float.intBitsToFloat((int) (oioVar.d() & 4294967295L));
                float I0 = oioVar.I0(2);
                int i2 = 0;
                for (Object obj2 : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        e43.t();
                        throw null;
                    }
                    float floatValue = ((Number) ((if2) obj2).d()).floatValue() * intBitsToFloat3;
                    oio.C1(oioVar, this.c, (Float.floatToRawIntBits((intBitsToFloat + intBitsToFloat2) * i2) << 32) | (Float.floatToRawIntBits(intBitsToFloat3 - floatValue) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(floatValue) & 4294967295L), (Float.floatToRawIntBits(I0) & 4294967295L) | (Float.floatToRawIntBits(I0) << 32), null, PsExtractor.VIDEO_STREAM_MASK);
                    i2 = i3;
                }
                return s3q0.a;
        }
    }
}
