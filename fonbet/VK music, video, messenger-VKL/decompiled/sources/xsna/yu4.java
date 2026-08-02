package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.audio.AudioMessageSource;
import java.io.File;

/* compiled from: AudioRecordObserver.java */
/* loaded from: classes15.dex */
public interface yu4 {
    void a(@NonNull String str, File file, boolean z);

    void b(Exception exc, @Nullable String str);

    void c(@NonNull String str, long j, double d);

    void d(@NonNull String str, File file, boolean z, boolean z2, boolean z3, long j, byte[] bArr, AudioMessageSource audioMessageSource);
}
