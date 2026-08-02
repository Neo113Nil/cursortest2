package xsna;

import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.vk.camera.editor.stories.impl.share.content.StoryShareContentType;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.picture.c;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.rdm0;

/* compiled from: StoryShareContentItemHolder.kt */
/* loaded from: classes16.dex */
public final class qdm0 extends vfz<rdm0.b> {
    public final izs<x7j0, s3q0> l;
    public final StoryShareContentType m;
    public rdm0.b n;
    public final VkAvatar o;
    public final CheckBox p;
    public final TextView q;

    /* compiled from: StoryShareContentItemHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoryShareContentType.values().length];
            try {
                iArr[StoryShareContentType.BOTTOM_SHEET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoryShareContentType.LONG_TAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public qdm0(ViewGroup viewGroup, izs<? super x7j0, s3q0> izsVar, StoryShareContentType storyShareContentType) {
        super(tf3.b(viewGroup, R.layout.item_editor_story_author_holder, viewGroup, false));
        this.l = izsVar;
        this.m = storyShareContentType;
        VkAvatar vkAvatar = (VkAvatar) this.itemView.findViewById(R.id.photo);
        this.o = vkAvatar;
        CheckBox checkBox = (CheckBox) this.itemView.findViewById(R.id.v_check);
        this.p = checkBox;
        this.q = (TextView) this.itemView.findViewById(R.id.name);
        this.itemView.setOnClickListener(new dm7(this, 5));
        int a2 = e3m.a(storyShareContentType.h(), this.itemView.getContext());
        int a3 = e3m.a(storyShareContentType.j(), this.itemView.getContext());
        bwt0.m0(a2, a2, vkAvatar);
        bwt0.m0(a3, a3, checkBox);
        checkBox.setBackground(m33.a(storyShareContentType.i(), this.itemView.getContext()));
        View view = this.itemView;
        bwt0.r0(e3m.a(storyShareContentType.k(), view.getContext()), view);
        bwt0.p0(checkBox, true);
        checkBox.setButtonTintList(anj.b(R.color.check_box_transparent_uncheked, this.itemView.getContext()));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(rdm0.b bVar) {
        LayerDrawable layerDrawable;
        rdm0.b bVar2 = bVar;
        boolean z = bVar2.e;
        this.n = bVar2;
        String str = bVar2.d;
        TextView textView = this.q;
        textView.setText(str);
        bwt0.p0(textView, str.length() > 0);
        int i = a.$EnumSwitchMapping$0[this.m.ordinal()];
        CheckBox checkBox = this.p;
        if (i == 1) {
            checkBox.setChecked(z);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bwt0.p0(checkBox, z);
        }
        Integer num = bVar2.g;
        if (num == null) {
            layerDrawable = null;
        } else {
            layerDrawable = (LayerDrawable) m33.a(R.drawable.story_empty_narrative, this.itemView.getContext());
            layerDrawable.findDrawableByLayerId(num.intValue()).setTint(this.itemView.getContext().getColor(R.color.vkui_tertiary_button_text));
        }
        String str2 = bVar2.c;
        if (str2 == null) {
            str2 = "";
        }
        if (layerDrawable == null) {
            layerDrawable = null;
        }
        c.d dVar = new c.d(str2, layerDrawable != null ? new eko(layerDrawable) : null);
        VkAvatar vkAvatar = this.o;
        vkAvatar.setContent(dVar);
        vkAvatar.setTag(bVar2.h);
    }
}
