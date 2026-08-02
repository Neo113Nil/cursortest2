package xsna;

import android.content.Context;
import com.vk.clips.design.view.component.description.ClipDescription;
import com.vk.clips.sdk.shared.api.utils.ClipFeedTooltip$ClipFeedTooltipType;
import com.vk.clips.viewer.impl.adapters.ClipVideoFileAdapter;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.OriginalSoundStatus;
import com.vkontakte.android.R;
import java.util.regex.Pattern;
import kotlin.LazyThreadSafetyMode;

/* compiled from: TooltipDelegate.kt */
/* loaded from: classes17.dex */
public final class g5p0 {
    public final y1d a;
    public final u6d b;
    public final h3d c;
    public ClipVideoFile d;
    public final String e;
    public final Object f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;

    /* compiled from: TooltipDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OriginalSoundStatus.values().length];
            try {
                iArr[OriginalSoundStatus.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OriginalSoundStatus.MODERATING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OriginalSoundStatus.DENIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public g5p0(y1d y1dVar, j1d j1dVar, h3d h3dVar) {
        this.a = y1dVar;
        this.b = j1dVar;
        this.c = h3dVar;
        Context context = e43.a;
        this.e = (context == null ? null : context).getString(R.string.clips_tooltip_subscribe_regex);
        this.f = msy.a(LazyThreadSafetyMode.NONE, new bi80(this, 27));
    }

    public final void a(ClipVideoFile clipVideoFile) {
        ClipVideoFile clipVideoFile2 = this.d;
        if (!epx.f(clipVideoFile2 != null ? clipVideoFile2.r1() : null, clipVideoFile.r1())) {
            this.a.g(false);
            this.g = false;
            this.h = false;
            this.i = false;
            this.j = false;
        } else if (!clipVideoFile2.x && clipVideoFile.x) {
            b();
        }
        this.d = clipVideoFile;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    public final void b() {
        ClipVideoFile clipVideoFile = this.d;
        if (clipVideoFile == null) {
            return;
        }
        ClipDescription descriptionView = this.a.getDescriptionView();
        CharSequence a2 = descriptionView.getConfig().a.a(descriptionView.getContext());
        boolean z = a2 != null && ((Pattern) this.f.getValue()).matcher(a2).find();
        ClipVideoFileAdapter clipVideoFileAdapter = new ClipVideoFileAdapter(clipVideoFile);
        ClipFeedTooltip$ClipFeedTooltipType clipFeedTooltip$ClipFeedTooltipType = ClipFeedTooltip$ClipFeedTooltipType.SUBSCRIBE;
        h3d h3dVar = this.c;
        boolean z2 = h3dVar.Ue(clipVideoFileAdapter, clipFeedTooltip$ClipFeedTooltipType).a;
        if (z || !z2) {
            return;
        }
        h3dVar.X6(new ClipVideoFileAdapter(clipVideoFile), clipFeedTooltip$ClipFeedTooltipType, null);
        this.b.a(a6d.b);
    }
}
