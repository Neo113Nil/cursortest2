package xsna;

/* compiled from: AudioBooksService.kt */
/* loaded from: classes2.dex */
public interface cl4 {
    default tfx a(Integer num, String str, String str2) {
        tfx tfxVar = new tfx("audioBooks.setProgress", new as(3), new p11(3));
        if (str != null) {
            tfx.o(tfxVar, "chapter_id", str, 0, 0, 12);
        }
        tfx.l(tfxVar, "time_from_start", num.intValue(), 0, 0, 8);
        tfx.o(tfxVar, "launch_origin", str2, 0, 0, 12);
        return tfxVar;
    }
}
