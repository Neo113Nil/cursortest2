package xsna;

/* compiled from: MediaMetadataUtils.kt */
/* loaded from: classes3.dex */
public final class uy1 {
    public boolean c;
    public String d;
    public Float i;
    public Throwable j;
    public int a = -1;
    public int b = -1;
    public long e = -1;
    public int f = -1;
    public int g = -1;
    public int h = -1;

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnalyzeResult{width=");
        sb.append(this.a);
        sb.append(", height=");
        sb.append(this.b);
        sb.append(", hasVideo=");
        sb.append(this.c);
        sb.append(", mimeType='");
        sb.append(this.d);
        sb.append("', fileSize=");
        sb.append(this.e);
        sb.append(", duration=");
        sb.append(this.f);
        sb.append(", videoFramerate=");
        return so.b(sb, this.i, '}');
    }
}
