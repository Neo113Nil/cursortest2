package xsna;

import com.vk.video.polls.entrypoint.model.UxPollEntryPoint;

/* compiled from: UxPollsEntryPointVisibilityRepository.kt */
/* loaded from: classes6.dex */
public interface a5r0 {
    void a(UxPollEntryPoint uxPollEntryPoint, boolean z, boolean z2);

    default void b(UxPollEntryPoint uxPollEntryPoint, boolean z) {
        a(uxPollEntryPoint, false, z);
    }
}
