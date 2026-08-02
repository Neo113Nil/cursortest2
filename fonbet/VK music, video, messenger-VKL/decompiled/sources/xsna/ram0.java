package xsna;

import android.app.Activity;
import android.content.Context;
import android.util.Size;
import android.util.TypedValue;
import android.view.Window;
import com.vk.core.view.components.button.VkButton;
import com.vk.story.api.domain.interactor.repost.PublishedKind;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import xsna.ikv0;

/* compiled from: StoryPublishProcessNotifierImpl.kt */
/* loaded from: classes6.dex */
public final class ram0 implements pam0 {
    public final uvl0 a;
    public final qdz b;

    /* compiled from: StoryPublishProcessNotifierImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PublishedKind.values().length];
            try {
                iArr[PublishedKind.CLIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PublishedKind.STORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ram0(uvl0 uvl0Var, qdz qdzVar) {
        this.a = uvl0Var;
        this.b = qdzVar;
    }

    public static Triple h() {
        Context E;
        Window window;
        c63 c63Var = c63.a;
        Activity b = c63.b();
        if (b == null) {
            return null;
        }
        TypedValue typedValue = krv0.a;
        if (krv0.b == null || (E = dhr0.E()) == null || (window = b.getWindow()) == null) {
            return null;
        }
        return new Triple(E, b, window);
    }

    @Override // xsna.pam0
    public final void a(String str, Window window, PublishedKind publishedKind) {
        i0q0.f(new v9b0(this, window, str, publishedKind, 1));
    }

    @Override // xsna.pam0
    public final void b(int i) {
        i0q0.f(new em70(this, i, 1));
    }

    @Override // xsna.pam0
    public final void c(final int i, final Window window, final PublishedKind publishedKind) {
        i0q0.f(new gzs() { // from class: xsna.qam0
            @Override // xsna.gzs
            public final Object invoke() {
                ram0 ram0Var = ram0.this;
                int i2 = i;
                PublishedKind publishedKind2 = publishedKind;
                Window window2 = window;
                TypedValue typedValue = krv0.a;
                Context s = krv0.b == null ? null : dhr0.s();
                if (s == null) {
                    return s3q0.a;
                }
                ram0Var.f(s, i2, publishedKind2).d(window2);
                return s3q0.a;
            }
        });
    }

    @Override // xsna.pam0
    public final void d(String str) {
        i0q0.f(new qk(20, this, str));
    }

    @Override // xsna.pam0
    public final void e(PublishedKind publishedKind) {
        i0q0.f(new ajd0(this, publishedKind));
    }

    public final ikv0 f(Context context, int i, PublishedKind publishedKind) {
        int i2;
        ikv0.a aVar = new ikv0.a(context);
        int i3 = a.$EnumSwitchMapping$0[publishedKind.ordinal()];
        if (i3 == 1) {
            i2 = R.string.story_clip_repost_failed;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R.string.story_publish_failed;
        }
        aVar.u = new ikv0.d(new ikv0.d.c(context.getString(i2)), (ikv0.d.b) null, (ikv0.d.a) null, 6);
        String string = context.getString(R.string.retry_repost);
        VkButton.Appearance appearance = VkButton.Appearance.Accent;
        aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, string, new wlw(this, i, 4));
        aVar.o = Integer.valueOf(iah0.a(58));
        return aVar.b();
    }

    public final ikv0 g(Context context, Activity activity, String str, PublishedKind publishedKind) {
        int i;
        int i2 = a.$EnumSwitchMapping$0[publishedKind.ordinal()];
        if (i2 == 1) {
            i = R.string.story_clip_reposted;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.story_published;
        }
        ikv0.a aVar = new ikv0.a(context);
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_24, Integer.valueOf(R.attr.vk_ui_icon_positive), (Size) null, 12);
        aVar.u = new ikv0.d(new ikv0.d.c(context.getString(i)), (ikv0.d.b) null, (ikv0.d.a) null, 6);
        String string = context.getString(R.string.open_reposted_story);
        VkButton.Appearance appearance = VkButton.Appearance.Accent;
        aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, string, new t3b(this, activity, str, 8));
        aVar.o = Integer.valueOf(iah0.a(58));
        return aVar.b();
    }
}
