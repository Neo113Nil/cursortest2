package ru.ok.android.webrtc.animoji.util;

import java.nio.ByteBuffer;
import xsna.zcl;

/* loaded from: classes9.dex */
public abstract class AnimojiDataPackagePayload {
    public static final Companion Companion = new Companion(null);
    public static final int MESSAGE_TYPE_ANIMOJI_DATA = 0;
    public static final int MESSAGE_TYPE_BG_COLOR = 2;
    public static final int MESSAGE_TYPE_EOS = 1;

    public static final class AnimojiData extends AnimojiSendPackagePayload {
        public final float[] a;

        public AnimojiData(float[] fArr) {
            super(null);
            this.a = fArr;
        }

        public final float[] getData() {
            return this.a;
        }
    }

    public static abstract class AnimojiSendPackagePayload extends AnimojiDataPackagePayload {
        public AnimojiSendPackagePayload(zcl zclVar) {
            super(null);
        }
    }

    public static final class BgColor extends AnimojiSendPackagePayload {
        public final int a;

        public BgColor(int i) {
            super(null);
            this.a = i;
        }

        public final int getColor() {
            return this.a;
        }
    }

    public static final class Companion {
        public Companion(zcl zclVar) {
        }
    }

    public static final class EOS extends AnimojiSendPackagePayload {
        public static final EOS INSTANCE = new EOS();

        public EOS() {
            super(null);
        }
    }

    public static final class Unknown extends AnimojiDataPackagePayload {
        public final ByteBuffer a;

        public Unknown(ByteBuffer byteBuffer) {
            super(null);
            this.a = byteBuffer;
        }

        public final ByteBuffer getRaw() {
            return this.a;
        }
    }

    public AnimojiDataPackagePayload(zcl zclVar) {
    }
}
