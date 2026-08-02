package xsna;

import android.app.Application;

/* compiled from: ContentRegisterComponentFactories.kt */
/* loaded from: classes11.dex */
public final class ukj {
    public static final void a(i7m i7mVar, Application application) {
        i7mVar.b("com.vk.profile.user.api.di.UserProfileComponent", new q03(4));
        i7mVar.d("com.vk.profile.user.api.di.UserProfileParamsComponent", new n66(application, 3));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.story.api.di.StoriesComponent", new sq6(4));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.archive.api.di.StoryArchiveComponent", new c13(4));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.photos.root.di.PhotosComponent", new r30(application, 4));
        i7mVar.b("com.vk.mytarget.AdsSdkComponent", new knf(2));
        i7mVar.b("com.vk.gallerypicker.di.GalleryPickerComponent", new lnf(2));
        i7mVar.b("com.vk.preview.di.GalleryPickerPreviewComponent", new s12(2));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.story.viewer.stat.di.StoryStatisticsComponent", new tog(1));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.story.settings.api.di.StoriesSettingsComponent", new j55(3));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.story.viewer.api.di.StoryViewerComponent", new r12(3));
        i7mVar.b("com.vk.stories.viewer.reactions.api.di.StoryReactionsComponent", new k55(2));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.narratives.api.di.NarrativeComponent", new u94(3));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.camera.editor.common.di.CommonEditorComponent", new v94(4));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.camera.editor.stories.api.di.StoryEditorComponent", new w94(4));
        i7mVar.b("com.vk.posting.di.PostingComponent", new cd3(4));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.stickers.api.di.StickersComponent", new tkj(application, 0));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.gif.di.GifSelectorComponent", new a68(4));
        i7mVar.b("com.vk.articleeditor.api.di.ArticleComponent", new ug9(2));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.content.privacy.di.ContentPrivacyComponent", new r03(2));
        i7mVar.b("com.vk.newsfeed.api.di.PostingSettingsComponent", new t03(4));
        i7mVar.b("com.vk.documents.api.di.DocumentsComponent", new e53(4));
        i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.editor.di.StoryEditorExtDepsComponent", new rq6(3));
    }
}
