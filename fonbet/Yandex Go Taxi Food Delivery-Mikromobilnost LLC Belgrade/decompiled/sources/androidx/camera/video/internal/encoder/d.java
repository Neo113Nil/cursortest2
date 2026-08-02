package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import android.os.Bundle;
import android.util.Range;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import defpackage.d6z;
import defpackage.fzn;
import defpackage.mq61;
import defpackage.ny61;
import defpackage.sgb1;
import defpackage.syn;
import defpackage.vbj;
import defpackage.yci0;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;
    public final /* synthetic */ long c;

    public /* synthetic */ d(j jVar, long j, int i) {
        this.a = i;
        this.b = jVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j jVar = this.b;
                long j = this.c;
                switch (jVar.w.ordinal()) {
                    case 0:
                    case 2:
                    case 3:
                    case 5:
                    case 7:
                        break;
                    case 1:
                        String str = jVar.a;
                        mq61.g(j);
                        sgb1.g(3, str);
                        jVar.p.addLast(Range.create(Long.valueOf(j), Long.valueOf(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED)));
                        jVar.j(EncoderImpl$InternalState.PAUSED);
                        break;
                    case 4:
                        jVar.j(EncoderImpl$InternalState.PENDING_START_PAUSED);
                        break;
                    case 6:
                    case 8:
                        ny61.r("Encoder is released");
                        break;
                    default:
                        yci0.t(jVar.w, "Unknown state: ");
                        break;
                }
            default:
                j jVar2 = this.b;
                long j2 = this.c;
                switch (jVar2.w.ordinal()) {
                    case 0:
                        jVar2.A = null;
                        String str2 = jVar2.a;
                        mq61.g(j2);
                        sgb1.g(3, str2);
                        try {
                            if (jVar2.D) {
                                jVar2.i();
                            }
                            jVar2.x = Range.create(Long.valueOf(j2), Long.valueOf(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED));
                            sgb1.g(3, jVar2.a);
                            jVar2.f.start();
                            syn synVar = jVar2.g;
                            if (synVar instanceof fzn) {
                                ((fzn) synVar).d(true);
                            }
                            jVar2.j(EncoderImpl$InternalState.STARTED);
                            break;
                        } catch (MediaCodec.CodecException e) {
                            jVar2.b(1, e.getMessage(), e);
                        }
                    case 1:
                    case 4:
                    case 7:
                        break;
                    case 2:
                        jVar2.A = null;
                        Range range = (Range) jVar2.p.removeLast();
                        d6z.y("There should be a \"pause\" before \"resume\"", range != null && ((Long) range.getUpper()).longValue() == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                        Long l = (Long) range.getLower();
                        long longValue = l.longValue();
                        jVar2.p.addLast(Range.create(l, Long.valueOf(j2)));
                        String str3 = jVar2.a;
                        mq61.g(j2);
                        mq61.g(j2 - longValue);
                        sgb1.g(3, str3);
                        if ((jVar2.c || vbj.a.b(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!jVar2.c || vbj.a.b(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("drop-input-frames", 0);
                            sgb1.g(3, jVar2.a);
                            jVar2.f.setParameters(bundle);
                            syn synVar2 = jVar2.g;
                            if (synVar2 instanceof fzn) {
                                ((fzn) synVar2).d(true);
                            }
                        }
                        if (jVar2.c) {
                            jVar2.h();
                        }
                        jVar2.j(EncoderImpl$InternalState.STARTED);
                        break;
                    case 3:
                    case 5:
                        jVar2.j(EncoderImpl$InternalState.PENDING_START);
                        break;
                    case 6:
                    case 8:
                        ny61.r("Encoder is released");
                        break;
                    default:
                        yci0.t(jVar2.w, "Unknown state: ");
                        break;
                }
        }
    }
}
