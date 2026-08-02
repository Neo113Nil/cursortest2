package xsna;

import android.os.Handler;
import com.vk.editor.analytics.StoryEditorEvents;
import com.vk.superapp.api.dto.story.WebStickerType;

/* compiled from: AnalyticsDelegateImpl.kt */
/* loaded from: classes16.dex */
public final class px1 implements r76 {
    public final y3p a;
    public final Handler b;

    /* compiled from: AnalyticsDelegateImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WebStickerType.values().length];
            try {
                iArr[WebStickerType.HASHTAG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WebStickerType.MENTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WebStickerType.QUESTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: Handler.kt */
    public static final class b implements Runnable {
        public final /* synthetic */ WebStickerType b;
        public final /* synthetic */ px1 c;

        public b(WebStickerType webStickerType, px1 px1Var) {
            this.b = webStickerType;
            this.c = px1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = a.$EnumSwitchMapping$0[this.b.ordinal()];
            StoryEditorEvents storyEditorEvents = i != 1 ? i != 2 ? i != 3 ? null : StoryEditorEvents.EDIT_QUESTION : StoryEditorEvents.EDIT_STICKER : StoryEditorEvents.EDIT_STICKER;
            if (storyEditorEvents != null) {
                this.c.i(storyEditorEvents);
            }
        }
    }

    /* compiled from: Handler.kt */
    public static final class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            px1.this.a.i(StoryEditorEvents.EDIT_TEXT);
        }
    }

    public px1(y3p y3pVar, Handler handler) {
        this.a = y3pVar;
        this.b = handler;
    }

    @Override // xsna.r76
    public final void a() {
        this.a.a();
    }

    @Override // xsna.r76
    public final void b() {
        this.b.postDelayed(new qx1(this), 100L);
    }

    @Override // xsna.r76
    public final void c() {
        this.a.c();
    }

    @Override // xsna.r76
    public final void d() {
        this.b.postDelayed(new rx1(this, 0), 100L);
    }

    @Override // xsna.r76
    public final void e() {
        this.b.postDelayed(new sx1(this), 100L);
    }

    @Override // xsna.r76
    public final void f() {
        this.b.postDelayed(new tx1(this), 100L);
    }

    @Override // xsna.r76
    public final void g() {
        this.a.g();
    }

    @Override // xsna.r76
    public final void h() {
        this.a.h();
    }

    @Override // xsna.r76
    public final void i(StoryEditorEvents storyEditorEvents) {
        this.a.i(storyEditorEvents);
    }

    @Override // xsna.r76
    public final void j() {
        this.a.q();
    }

    @Override // xsna.r76
    public final void k() {
        this.b.postDelayed(new c(), 100L);
    }

    @Override // xsna.r76
    public final void l(WebStickerType webStickerType) {
        this.b.postDelayed(new b(webStickerType, this), 100L);
    }
}
