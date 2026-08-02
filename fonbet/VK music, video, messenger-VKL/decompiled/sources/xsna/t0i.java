package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.clips.design.view.component.video.preview.ClipRectanglePreview;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Image;
import com.vkontakte.android.R;
import java.util.Locale;
import xsna.tlo0;
import xsna.u0i;

/* compiled from: CommunityScheduledClipsGridOwnerClipsListAdapter.kt */
/* loaded from: classes5.dex */
public final class t0i extends zoj0<o0i, RecyclerView.e0> {
    public final qu e;
    public final int f;

    /* compiled from: CommunityScheduledClipsGridOwnerClipsListAdapter.kt */
    public static final class a extends m.e<o0i> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(o0i o0iVar, o0i o0iVar2) {
            return epx.f(o0iVar.a, o0iVar2.a);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(o0i o0iVar, o0i o0iVar2) {
            o0i o0iVar3 = o0iVar2;
            ClipVideoFile clipVideoFile = o0iVar.a;
            int i = clipVideoFile.c;
            if (i == 0) {
                return false;
            }
            ClipVideoFile clipVideoFile2 = o0iVar3.a;
            return i == clipVideoFile2.c && clipVideoFile.r == clipVideoFile2.r;
        }

        @Override // androidx.recyclerview.widget.m.e
        public final Object getChangePayload(o0i o0iVar, o0i o0iVar2) {
            return o0iVar2;
        }
    }

    public t0i(qu quVar) {
        super(new com.vk.lists.a(new a()));
        this.e = quVar;
        this.f = 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0098, code lost:
    
        if (r1 == null) goto L18;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        String str;
        if (e0Var instanceof s0i) {
            s0i s0iVar = (s0i) e0Var;
            o0i o0iVar = (o0i) this.c.c(i);
            s0iVar.m = o0iVar;
            View view = s0iVar.itemView;
            u0i u0iVar = view instanceof u0i ? (u0i) view : null;
            if (u0iVar != null) {
                ClipVideoFile clipVideoFile = o0iVar.a;
                Image image = clipVideoFile.I0;
                ClipRectanglePreview clipRectanglePreview = u0iVar.b;
                clipRectanglePreview.setBackgroundContent(new ClipRectanglePreview.PreviewItem.a(new u0i.b(image)));
                clipRectanglePreview.setEndTopIcon(null);
                clipRectanglePreview.setSecondaryLabel(null);
                clipRectanglePreview.setStartTopIcon(null);
                gko gkoVar = new gko(R.drawable.vk_icon_clock_outline_28);
                ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                clipRectanglePreview.setMainIcon(new ClipRectanglePreview.PreviewItem.Icon(gkoVar, new x7g(R.attr.vk_ui_icon_contrast), ClipRectanglePreview.PreviewItem.Icon.Mode.ICON_BIG, 40));
                clipRectanglePreview.setMainActionUpload(null);
                tlo0.a aVar = tlo0.Companion;
                int i2 = clipVideoFile.r;
                Integer valueOf = i2 > 0 ? Integer.valueOf(i2) : null;
                if (valueOf != null) {
                    str = pvo0.i(false, valueOf.intValue(), false, true);
                    if (str.length() > 0) {
                        str = ((Object) String.valueOf(str.charAt(0)).toUpperCase(Locale.ROOT)) + str.substring(1);
                    }
                }
                str = "";
                clipRectanglePreview.setPrimaryLabel(new ClipRectanglePreview.PreviewItem.b(oq.d(aVar, str), 1, new x7g(R.attr.vk_ui_text_contrast), null, null, 248));
                clipRectanglePreview.setEnableDimmingOverlay(true);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new s0i(viewGroup, new eqd(this, 8));
    }
}
