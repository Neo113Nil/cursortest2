package xsna;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.ui.modal.b;
import com.vk.core.view.components.picture.c;
import com.vk.dto.common.ClipStatStoryData;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.shortvideo.ClipsAuthor;
import com.vkontakte.android.R;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import kotlin.NoWhenBranchMatchedException;
import xsna.c5v0;
import xsna.tlo0;

/* compiled from: CounterControllerBase.kt */
/* loaded from: classes17.dex */
public class nxj {
    public final fee a;
    public final Context b;
    public dw20 c;

    /* compiled from: CounterControllerBase.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipStatStoryData.Type.values().length];
            try {
                iArr[ClipStatStoryData.Type.Likes.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipStatStoryData.Type.Views.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public nxj(fee feeVar, Context context) {
        this.a = feeVar;
        this.b = context;
    }

    public final void a(ClipsAuthor clipsAuthor, ClipStatStoryData.Type type, boolean z) {
        int i;
        int i2;
        long f;
        String format;
        int i3;
        long f2;
        nxj nxjVar;
        Context context;
        c5v0.a.C2643a c2643a;
        VkModal.Mode mode = VkModal.Mode.Card;
        int[] iArr = a.$EnumSwitchMapping$0;
        int i4 = iArr[type.ordinal()];
        if (i4 == 1) {
            i = R.drawable.icon_profile_likes;
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.drawable.icon_profile_views;
        }
        c5v0.c.d dVar = new c5v0.c.d(new c.b(new gko(i)), 0, 6);
        int i5 = iArr[type.ordinal()];
        if (i5 == 1) {
            i2 = R.plurals.clips_grid_group_author_likes_description;
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R.plurals.clips_grid_group_author_views_description;
        }
        int i6 = iArr[type.ordinal()];
        if (i6 == 1) {
            f = clipsAuthor.f();
        } else {
            if (i6 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = clipsAuthor.i();
        }
        int i7 = iArr[type.ordinal()];
        if (i7 == 1) {
            long f3 = clipsAuthor.f();
            char c = (char) 8239;
            DecimalFormat decimalFormat = uqm0.d;
            if (decimalFormat == null) {
                decimalFormat = new DecimalFormat();
                uqm0.d = decimalFormat;
                DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
                decimalFormatSymbols.setGroupingSeparator(c);
                decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
            }
            format = decimalFormat.format(f3);
        } else {
            if (i7 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            long i8 = clipsAuthor.i();
            char c2 = (char) 8239;
            DecimalFormat decimalFormat2 = uqm0.d;
            if (decimalFormat2 == null) {
                decimalFormat2 = new DecimalFormat();
                uqm0.d = decimalFormat2;
                DecimalFormatSymbols decimalFormatSymbols2 = decimalFormat2.getDecimalFormatSymbols();
                decimalFormatSymbols2.setGroupingSeparator(c2);
                decimalFormat2.setDecimalFormatSymbols(decimalFormatSymbols2);
            }
            format = decimalFormat2.format(i8);
        }
        int i9 = iArr[type.ordinal()];
        int i10 = R.plurals.clips_grid_author_views_description;
        if (i9 == 1) {
            i3 = R.plurals.clips_grid_author_likes_description;
        } else {
            if (i9 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = R.plurals.clips_grid_author_views_description;
        }
        int i11 = iArr[type.ordinal()];
        if (i11 == 1) {
            i10 = R.plurals.clips_grid_other_author_likes_description;
        } else if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Owner owner = clipsAuthor.b;
        boolean b = fkq0.b(owner.b);
        Context context2 = this.b;
        String h = b ? enj.h(context2.getResources(), i2, f, owner.c, format) : this.a.F0() ? enj.h(context2.getResources(), i3, f, format) : enj.h(context2.getResources(), i10, f, owner.h, format);
        c5v0.a.C2643a c2643a2 = null;
        c5v0.b bVar = new c5v0.b(12, oq.d(tlo0.Companion, h), z ? new tlo0.f(R.string.clips_grid_author_subtitles) : null);
        int i12 = iArr[type.ordinal()];
        if (i12 == 1) {
            f2 = clipsAuthor.f();
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f2 = clipsAuthor.i();
        }
        long j = f2;
        if (z) {
            context = context2;
            nxjVar = this;
            c2643a = new c5v0.a.C2643a(new tlo0.f(R.string.share), new lxj(this, type, j, clipsAuthor), null, null, null, false, IronSourceError.ERROR_CODE_INIT_FAILED);
        } else {
            nxjVar = this;
            context = context2;
            c2643a = new c5v0.a.C2643a(new tlo0.f(R.string.ok), new mxj(nxjVar, 0), null, null, null, false, IronSourceError.ERROR_CODE_INIT_FAILED);
        }
        nxjVar.c = new VkModal(mode, new b.a.C0790b(dVar, bVar, null, new c5v0.a(c2643a, c2643a2, 6), 52), null, false, 28).b(context, fpf0.a(nxj.class).l());
    }
}
