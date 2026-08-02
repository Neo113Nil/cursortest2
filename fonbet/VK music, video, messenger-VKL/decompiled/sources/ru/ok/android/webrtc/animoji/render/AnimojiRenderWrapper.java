package ru.ok.android.webrtc.animoji.render;

import java.util.concurrent.TimeUnit;
import xsna.asp;
import xsna.zrp;

/* loaded from: classes9.dex */
public interface AnimojiRenderWrapper {
    public static final Companion Companion = Companion.a;
    public static final int defaultSize = 1024;
    public static final long minFrameDelayMs = 4;
    public static final int minSize = 256;
    public static final long targetFramePaceMs = 33;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AntiAlias {
        public static final AntiAlias LIGHT;
        public static final AntiAlias NONE;
        public static final AntiAlias PRIMARY;
        public static final /* synthetic */ AntiAlias[] b;
        public static final /* synthetic */ zrp c;
        public final float a;

        static {
            AntiAlias antiAlias = new AntiAlias("NONE", 0, 1.0f);
            NONE = antiAlias;
            AntiAlias antiAlias2 = new AntiAlias("LIGHT", 1, 1.1f);
            LIGHT = antiAlias2;
            AntiAlias antiAlias3 = new AntiAlias("PRIMARY", 2, 1.333f);
            PRIMARY = antiAlias3;
            AntiAlias[] antiAliasArr = {antiAlias, antiAlias2, antiAlias3};
            b = antiAliasArr;
            c = new asp(antiAliasArr);
        }

        public AntiAlias(String str, int i, float f) {
            this.a = f;
        }

        public static zrp<AntiAlias> getEntries() {
            return c;
        }

        public static AntiAlias valueOf(String str) {
            return (AntiAlias) Enum.valueOf(AntiAlias.class, str);
        }

        public static AntiAlias[] values() {
            return (AntiAlias[]) b.clone();
        }

        public final float getScale() {
            return this.a;
        }
    }

    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        public static final long b = TimeUnit.SECONDS.toMillis(2);
        public static final int defaultSize = 1024;
        public static final long minFrameDelayMs = 4;
        public static final int minSize = 256;
        public static final long targetFramePaceMs = 33;

        public final long getSvgRetryIntervalMs() {
            return b;
        }
    }

    void notifyAnimojiChanged();

    void onBgColor(int i);

    void onLandmarks(float[] fArr);

    void onSetFrameSize(int i, int i2, AntiAlias antiAlias);

    void release();

    void startDrawing();

    void stopDrawing();
}
