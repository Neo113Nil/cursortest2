package xsna;

import android.content.Context;
import android.view.View;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetTemplateExtendedResponseDto;
import com.vk.dto.common.clips.ClipAudioTemplate;

/* compiled from: ClipsTemplatesEditorProvider.kt */
/* loaded from: classes.dex */
public interface v8f {
    io.reactivex.rxjava3.core.x<ShortVideoGetTemplateExtendedResponseDto> a(Context context, String str);

    void b(View view, m7f m7fVar);

    void c(Context context, Throwable th, String str, izs<? super String, s3q0> izsVar);

    void d(View view, ClipAudioTemplate clipAudioTemplate, ShortVideoGetTemplateExtendedResponseDto shortVideoGetTemplateExtendedResponseDto, String str);
}
