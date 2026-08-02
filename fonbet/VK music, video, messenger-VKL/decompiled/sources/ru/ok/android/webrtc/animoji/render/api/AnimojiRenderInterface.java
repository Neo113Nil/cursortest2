package ru.ok.android.webrtc.animoji.render.api;

import android.os.Handler;
import java.io.Closeable;
import xsna.de;
import xsna.h5s;
import xsna.odj;

/* loaded from: classes9.dex */
public interface AnimojiRenderInterface extends Closeable {

    public static final class DrawResult {
        public final int a;
        public final int b;
        public final int c;

        public DrawResult(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        public static /* synthetic */ DrawResult copy$default(DrawResult drawResult, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = drawResult.a;
            }
            if ((i4 & 2) != 0) {
                i2 = drawResult.b;
            }
            if ((i4 & 4) != 0) {
                i3 = drawResult.c;
            }
            return drawResult.copy(i, i2, i3);
        }

        public final int component1() {
            return this.a;
        }

        public final int component2() {
            return this.b;
        }

        public final int component3() {
            return this.c;
        }

        public final DrawResult copy(int i, int i2, int i3) {
            return new DrawResult(i, i2, i3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DrawResult)) {
                return false;
            }
            DrawResult drawResult = (DrawResult) obj;
            return this.a == drawResult.a && this.b == drawResult.b && this.c == drawResult.c;
        }

        public final int getHeight() {
            return this.c;
        }

        public final int getTextureId() {
            return this.a;
        }

        public final int getWidth() {
            return this.b;
        }

        public int hashCode() {
            return Integer.hashCode(this.c) + de.v(this.b, Integer.hashCode(this.a) * 31);
        }

        public String toString() {
            return h5s.c(this.c, ")", odj.a(this.a, this.b, "DrawResult(textureId=", ", width=", ", height="));
        }
    }

    void acceptBgColor(int i);

    void acceptLandmarks(float[] fArr);

    void acceptSvg(byte[] bArr, int i);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void draw(int i, int i2);

    DrawResult getResult();

    void init(Handler handler, String str);
}
