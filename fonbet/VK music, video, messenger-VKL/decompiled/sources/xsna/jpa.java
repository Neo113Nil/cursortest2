package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox;
import com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import xsna.kpa;

/* compiled from: CencMp4TrackImplImpl.java */
/* loaded from: classes13.dex */
public final class jpa extends zf30 implements ipa {
    public ArrayList o;

    /* compiled from: CencMp4TrackImplImpl.java */
    public class a {
        public final yej a;
        public SampleAuxiliaryInformationSizesBox b;
        public SampleAuxiliaryInformationOffsetsBox c;

        public a(yej yejVar) {
            this.a = yejVar;
        }

        public final void a() {
            yej yejVar = this.a;
            List boxes = yejVar.getBoxes(SampleAuxiliaryInformationSizesBox.class);
            List boxes2 = yejVar.getBoxes(SampleAuxiliaryInformationOffsetsBox.class);
            this.b = null;
            this.c = null;
            for (int i = 0; i < boxes.size(); i++) {
                if ((this.b == null && ((SampleAuxiliaryInformationSizesBox) boxes.get(i)).getAuxInfoType() == null) || C.CENC_TYPE_cenc.equals(((SampleAuxiliaryInformationSizesBox) boxes.get(i)).getAuxInfoType())) {
                    this.b = (SampleAuxiliaryInformationSizesBox) boxes.get(i);
                } else {
                    SampleAuxiliaryInformationSizesBox sampleAuxiliaryInformationSizesBox = this.b;
                    if (sampleAuxiliaryInformationSizesBox == null || sampleAuxiliaryInformationSizesBox.getAuxInfoType() != null || !C.CENC_TYPE_cenc.equals(((SampleAuxiliaryInformationSizesBox) boxes.get(i)).getAuxInfoType())) {
                        throw new RuntimeException("Are there two cenc labeled saiz?");
                    }
                    this.b = (SampleAuxiliaryInformationSizesBox) boxes.get(i);
                }
                if ((this.c == null && ((SampleAuxiliaryInformationOffsetsBox) boxes2.get(i)).getAuxInfoType() == null) || C.CENC_TYPE_cenc.equals(((SampleAuxiliaryInformationOffsetsBox) boxes2.get(i)).getAuxInfoType())) {
                    this.c = (SampleAuxiliaryInformationOffsetsBox) boxes2.get(i);
                } else {
                    SampleAuxiliaryInformationOffsetsBox sampleAuxiliaryInformationOffsetsBox = this.c;
                    if (sampleAuxiliaryInformationOffsetsBox == null || sampleAuxiliaryInformationOffsetsBox.getAuxInfoType() != null || !C.CENC_TYPE_cenc.equals(((SampleAuxiliaryInformationOffsetsBox) boxes2.get(i)).getAuxInfoType())) {
                        throw new RuntimeException("Are there two cenc labeled saio?");
                    }
                    this.c = (SampleAuxiliaryInformationOffsetsBox) boxes2.get(i);
                }
            }
        }
    }

    public static kpa c(long j, int i, ByteBuffer byteBuffer) {
        kpa kpaVar = new kpa();
        if (j > 0) {
            byte[] bArr = new byte[i];
            kpaVar.a = bArr;
            byteBuffer.get(bArr);
            if (j > i) {
                kpaVar.b = new kpa.j[crx0.u(byteBuffer)];
                int i2 = 0;
                while (true) {
                    kpa.j[] jVarArr = kpaVar.b;
                    if (i2 >= jVarArr.length) {
                        break;
                    }
                    jVarArr[i2] = kpa.a(crx0.u(byteBuffer), crx0.w(byteBuffer));
                    i2++;
                }
            }
        }
        return kpaVar;
    }

    @Override // xsna.ci, xsna.uep0
    public final String getName() {
        return i5s.a(new StringBuilder("enc("), this.b, ")");
    }

    @Override // xsna.ipa
    public final ArrayList m2() {
        return this.o;
    }

    public final String toString() {
        return i5s.a(new StringBuilder("CencMp4TrackImpl{handler='"), this.m, "'}");
    }
}
