package xsna;

import android.content.Context;
import android.text.Annotation;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import xsna.k1u0;
import xsna.ngv0;
import xsna.tgv0;
import xsna.tlo0;
import xsna.w9m0;

/* compiled from: StoryPrivacyItemHolder.kt */
/* loaded from: classes16.dex */
public final class v9m0 extends vfz<w9m0.a> {
    public final izs<a9m0, s3q0> l;
    public final VkRichCell m;
    public final View n;
    public final VkText o;

    /* compiled from: StoryPrivacyItemHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoryPrivacyType.values().length];
            try {
                iArr[StoryPrivacyType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoryPrivacyType.FRIENDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoryPrivacyType.BEST_FRIENDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StoryPrivacyType.ONLY_ME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StoryPrivacyType.FRIENDS_OF_FRIENDS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StoryPrivacyType.SOME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StoryPrivacyType.EXCLUDED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public v9m0(View view, svk0 svk0Var) {
        super(view);
        this.l = svk0Var;
        this.m = (VkRichCell) view.findViewById(R.id.cell);
        this.n = view.findViewById(R.id.banner_container);
        this.o = (VkText) view.findViewById(R.id.banner_text);
    }

    @Override // xsna.vfz
    public final void W5(w9m0.a aVar) {
        int i;
        w9m0.a aVar2 = aVar;
        List<ayv0> list = aVar2.e;
        boolean z = aVar2.d;
        pgr pgrVar = new pgr(4, this, aVar2);
        VkRichCell vkRichCell = this.m;
        vkRichCell.setOnClickListener(pgrVar);
        vkRichCell.setBackground(e3m.e(R.attr.selectableItemBackground, vkRichCell.getContext()));
        tlo0.a aVar3 = tlo0.Companion;
        Context context = this.itemView.getContext();
        StoryPrivacyType storyPrivacyType = aVar2.b;
        int[] iArr = a.$EnumSwitchMapping$0;
        switch (iArr[storyPrivacyType.ordinal()]) {
            case 1:
                i = R.string.story_privacy_selector_all;
                break;
            case 2:
                i = R.string.story_privacy_selector_friends;
                break;
            case 3:
                i = R.string.story_privacy_selector_best_friend;
                break;
            case 4:
                i = R.string.story_privacy_selector_me;
                break;
            case 5:
                i = R.string.story_privacy_selector_friends_of_friends;
                break;
            case 6:
                i = R.string.story_privacy_selector_some;
                break;
            case 7:
                i = R.string.story_privacy_selector_hidden;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        tlo0.h d = oq.d(aVar3, context.getString(i));
        StoryPrivacyType storyPrivacyType2 = StoryPrivacyType.ALL;
        SpannableStringBuilder spannableStringBuilder = null;
        Integer valueOf = (storyPrivacyType == storyPrivacyType2 && z) ? Integer.valueOf(R.string.story_privacy_for_all_closed_hint) : (storyPrivacyType == StoryPrivacyType.EXCLUDED && list.isEmpty()) ? Integer.valueOf(R.string.story_privacy_ban_hint) : null;
        String string = valueOf != null ? this.itemView.getContext().getString(valueOf.intValue()) : null;
        tlo0.h hVar = string != null ? new tlo0.h(string) : null;
        StoryPrivacyType storyPrivacyType3 = StoryPrivacyType.EXCLUDED;
        pgv0 v = ahn.v(new vgv0(d, (ngv0.a) null, (ngv0) null, 0, 30), null, hVar != null ? new qgv0(hVar, (ngv0.a) null, (ngv0.a) null, 0, 30) : null, null, (storyPrivacyType != storyPrivacyType3 || list.isEmpty()) ? null : new tgv0.a(aVar2.e, null, new tlo0.d(R.plurals.users_quantity, aVar2.j), null, null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), null, null, 490);
        VkCell.Right.d a2 = aVar2.c ? VkCell.Right.c.a(VkCell.Right.Companion, null, null, new VkCell.Right.ExtraAction.a(6, null, true), null, 27) : null;
        VkCell.Right.d a3 = storyPrivacyType == storyPrivacyType3 ? VkCell.Right.c.a(VkCell.Right.Companion, null, null, null, new VkCell.Right.b(new dnh0(4, this, aVar2), (tlo0.f) null, (k1u0.a) null, 6), 23) : null;
        vkRichCell.setMiddle(v);
        if (a2 == null) {
            a2 = a3;
        }
        vkRichCell.setRight(a2);
        float f = 0.4f;
        if (!aVar2.i && (!z || storyPrivacyType != storyPrivacyType2)) {
            f = 1.0f;
        }
        vkRichCell.setAlpha(f);
        int i2 = iArr[storyPrivacyType.ordinal()];
        if (i2 == 4) {
            spannableStringBuilder = h6(R.string.story_privacy_remove_banner_only_me);
        } else if (i2 == 5) {
            spannableStringBuilder = h6(R.string.story_privacy_for_friends_of_friends_hint_subtitle);
        } else if (i2 == 6) {
            spannableStringBuilder = h6(R.string.story_privacy_for_some_hint_subtitle);
        }
        View view = this.n;
        if (spannableStringBuilder == null) {
            bwt0.p0(view, false);
        } else {
            bwt0.p0(view, true);
            this.o.setText(spannableStringBuilder);
        }
    }

    public final SpannableStringBuilder h6(int i) {
        CharSequence text = this.itemView.getContext().getText(i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
        int i2 = 0;
        Annotation[] annotationArr = (Annotation[]) spannableStringBuilder.getSpans(0, text.length(), Annotation.class);
        while (i2 < annotationArr.length) {
            int i3 = i2 + 1;
            try {
                Annotation annotation = annotationArr[i2];
                if (epx.f(annotation.getValue(), "privacy")) {
                    dhr0.a.getClass();
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(e3m.f(R.attr.vk_ui_text_primary, dhr0.s())), spannableStringBuilder.getSpanStart(annotation), spannableStringBuilder.getSpanEnd(annotation), 33);
                }
                i2 = i3;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }
        return spannableStringBuilder;
    }
}
