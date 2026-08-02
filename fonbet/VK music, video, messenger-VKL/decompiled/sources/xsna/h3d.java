package xsna;

import android.content.Context;
import android.view.Window;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.utils.ClipFeedTooltip$ClipFeedTooltipType;

/* compiled from: ClipItemViewCallback.kt */
/* loaded from: classes.dex */
public interface h3d {
    @ozl
    void Bd(xcd xcdVar);

    void C5(SdkClipVideoFile sdkClipVideoFile);

    void Ef(Context context, String str);

    void El();

    void Gm(SdkVideoFile sdkVideoFile, gzs gzsVar);

    io.reactivex.rxjava3.core.a Hl(SdkVideoFile sdkVideoFile);

    void Ih();

    void Qe(String str);

    void S9(SdkVideoFile sdkVideoFile);

    zyc Ue(SdkVideoFile sdkVideoFile, ClipFeedTooltip$ClipFeedTooltipType clipFeedTooltip$ClipFeedTooltipType);

    void X6(SdkVideoFile sdkVideoFile, ClipFeedTooltip$ClipFeedTooltipType clipFeedTooltip$ClipFeedTooltipType, hjj0 hjj0Var);

    void Z4(SdkClipVideoFile sdkClipVideoFile);

    void ah(SdkVideoFile sdkVideoFile);

    void g9(Integer num, Integer num2, g3d g3dVar);

    Context getContext();

    Window getWindow();

    void gh(String str);

    void o4(int i, SdkClipVideoFile sdkClipVideoFile);

    void pj(SdkClipVideoFile sdkClipVideoFile);

    void s5();

    void ye(int i);
}
