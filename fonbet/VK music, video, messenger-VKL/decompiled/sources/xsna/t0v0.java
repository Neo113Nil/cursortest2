package xsna;

import android.content.Context;
import com.vk.clips.design.view.favorites.folder.ClipsFoldersCoverView;
import com.vk.core.view.components.picture.VkPicture;

/* compiled from: VkImageViewControllerFactory.kt */
/* loaded from: classes16.dex */
public final class t0v0 implements ClipsFoldersCoverView.c {

    /* compiled from: VkImageViewControllerFactory.kt */
    public static final class a implements ClipsFoldersCoverView.b {
        public final VkPicture a;
        public String b;

        public a(Context context) {
            this.a = new VkPicture(context, null, 6, 0);
        }

        @Override // com.vk.clips.design.view.favorites.folder.ClipsFoldersCoverView.b
        public final void a(String str) {
            if (epx.f(this.b, str)) {
                return;
            }
            this.b = str;
            this.a.o0(str, null);
        }

        @Override // com.vk.clips.design.view.favorites.folder.ClipsFoldersCoverView.b
        public final void b(float f) {
            this.a.setCornerRadius(f);
        }

        @Override // com.vk.clips.design.view.favorites.folder.ClipsFoldersCoverView.b
        public final VkPicture getView() {
            return this.a;
        }
    }

    @Override // com.vk.clips.design.view.favorites.folder.ClipsFoldersCoverView.c
    public final a create(Context context) {
        return new a(context);
    }
}
