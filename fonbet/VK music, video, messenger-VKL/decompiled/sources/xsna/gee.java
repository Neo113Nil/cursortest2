package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.clips.sdk.shared.clips.SdkClipAudioTemplate;
import com.vk.dto.common.id.UserId;
import com.vk.dto.shortvideo.ClipCameraParams;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;

/* compiled from: ClipsGridScreenContract.kt */
/* loaded from: classes.dex */
public interface gee extends wee {
    void Dc(String str, String str2);

    void J7(View view, Rect rect, ClipGridParams.Data data, gzs<s3q0> gzsVar);

    void K1(ClipGridParams.Data data, ClipCameraParams clipCameraParams, String str, MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint, UserId userId);

    void M1();

    FragmentActivity We();

    void Z2(String str);

    void ga(SdkClipAudioTemplate sdkClipAudioTemplate);

    void mf(boolean z);
}
