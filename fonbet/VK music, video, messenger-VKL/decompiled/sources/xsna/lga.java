package xsna;

import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import xsna.u4a;
import xsna.yda;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class lga implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lga(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.b) {
            case 0:
                izs izsVar = (izs) this.c;
                int intValue = ((Integer) obj).intValue();
                int intValue2 = ((Integer) obj3).intValue();
                BlockId blockId = obj2 instanceof BlockId ? (BlockId) obj2 : null;
                BlockId blockId2 = obj4 instanceof BlockId ? (BlockId) obj4 : null;
                if (blockId != null && blockId2 != null) {
                    izsVar.invoke(new yda.d.a(intValue, blockId, intValue2, blockId2));
                }
                break;
            default:
                String str = (String) obj2;
                u4a.a aVar = ((u4a) this.c).b;
                nda.e(aVar.b, (Context) obj4, aVar.s, (String) obj, str, str, (SearchStatsLoggingInfo) obj3, null, PsExtractor.AUDIO_STREAM);
                break;
        }
        return s3q0.a;
    }
}
