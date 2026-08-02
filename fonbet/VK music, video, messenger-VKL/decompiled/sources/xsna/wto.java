package xsna;

import android.content.Context;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.newsfeed.Owner;
import com.vk.feed.core.models.ImagePhoto;
import com.vk.feed.core.models.dzen.DzenNews;
import com.vk.feed.core.models.dzen.DzenStory;
import com.vk.feed.design.view.newsfeed.dzen.storyitem.DzenStoryItemView;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.tlo0;
import xsna.xto;

/* compiled from: DzenStoryItemHolderTransformer.kt */
/* loaded from: classes4.dex */
public final class wto implements gn60<a, wm60> {
    public final int b;

    /* compiled from: DzenStoryItemHolderTransformer.kt */
    public static final class a {
        public final DzenStory a;
        public final s1c0 b;

        public a(DzenStory dzenStory, s1c0 s1c0Var) {
            this.a = dzenStory;
            this.b = s1c0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Params(dzenStory=" + this.a + ", displayContext=" + this.b + ')';
        }
    }

    /* compiled from: DzenStoryItemHolderTransformer.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DzenNews.TextSize.values().length];
            try {
                iArr[DzenNews.TextSize.LARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public wto(int i) {
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        if (r9 == null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List a(a aVar) {
        DzenStoryItemView.TitleStyle titleStyle;
        DzenStory dzenStory = aVar.a;
        s1c0 s1c0Var = aVar.b;
        DzenStory.DzenStoryItem dzenStoryItem = (DzenStory.DzenStoryItem) j5g.b0(this.b, dzenStory.j);
        if (dzenStoryItem == null) {
            return EmptyList.b;
        }
        DzenNews.ItemHeader itemHeader = dzenStoryItem.c;
        int i = s1c0Var.J ? R.dimen.dzen_story_item_image_height_lego : R.dimen.dzen_story_item_image_height;
        Context context = e43.a;
        xto.a.C4047a c4047a = null;
        if (context == null) {
            context = null;
        }
        int a2 = e3m.a(i, context);
        ImagePhoto imagePhoto = dzenStoryItem.b;
        if (imagePhoto != null) {
            String str = imagePhoto.c;
            Image image = imagePhoto.b;
            if (image != null) {
                Serializer.c<Owner> cVar = Owner.CREATOR;
                str = Owner.a.a(a2, image);
            } else if (str == null || !(!drm0.N(str))) {
                str = null;
            }
            if (str != null) {
                c4047a = new xto.a.C4047a(str);
            }
        }
        DzenNews.TextSize textSize = itemHeader.c;
        if (textSize != null) {
            if (b.$EnumSwitchMapping$0[textSize.ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            titleStyle = DzenStoryItemView.TitleStyle.Large;
        }
        titleStyle = DzenStoryItemView.TitleStyle.Medium;
        DzenStoryItemView.TitleStyle titleStyle2 = titleStyle;
        tlo0.a aVar2 = tlo0.Companion;
        ucp ucpVar = ucp.a;
        return Collections.singletonList(new xto(c4047a, titleStyle2, u11.f(aVar2, ucp.i(itemHeader.b)), new tlo0.h(ucp.i(dzenStoryItem.d.b)), dzenStoryItem, this.b));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public final /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return a((a) pair);
    }
}
