package xsna;

import com.vk.clips.design.view.author.ClipAuthorCellView;
import com.vk.clips.sdk.shared.item.clip.viewstate.MainOverlayState;
import com.vk.core.tool.view.vkblur.VkBlurContentView;

/* compiled from: ClipAuthorCellRenderDelegate.kt */
/* loaded from: classes17.dex */
public final class bmc {
    public final ClipAuthorCellView a;
    public final u6d b;
    public final boolean c;
    public final VkBlurContentView d;
    public x590 e;
    public MainOverlayState.g f;

    public bmc(ClipAuthorCellView clipAuthorCellView, u6d u6dVar, boolean z, VkBlurContentView vkBlurContentView) {
        this.a = clipAuthorCellView;
        this.b = u6dVar;
        this.c = z;
        this.d = vkBlurContentView;
        clipAuthorCellView.setOnClickListener(new t01(this, 3));
    }
}
