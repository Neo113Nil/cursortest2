package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import com.vk.imageloader.view.VKImageView;
import com.vk.photos.common.ui.tags.TagsSuggestionsOverlayView;
import com.vk.photos.ui.profile.ProfilePhotoTag;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: PhotoTagsImagesAdapter.kt */
/* loaded from: classes3.dex */
public final class mca0 extends zoj0<ProfilePhotoTag, RecyclerView.e0> {
    public final boolean e;
    public final nca0 f;
    public WeakReference<a> g;
    public boolean h;

    /* compiled from: PhotoTagsImagesAdapter.kt */
    public static final class a extends vif0<Integer> {
        public final TextView n;

        public a(ViewGroup viewGroup) {
            super(new TextView(viewGroup.getContext()));
            TextView textView = (TextView) this.itemView;
            this.n = textView;
            int a = iah0.a(12);
            textView.setGravity(17);
            RecyclerView.p pVar = new RecyclerView.p(-1, -2);
            pVar.setMarginStart(a);
            pVar.setMarginEnd(a);
            textView.setLayoutParams(pVar);
            textView.setTextColor(dhr0.t.c(R.attr.vk_ui_text_secondary));
            textView.setTextSize(2, 13.0f);
            f4m.y(a, textView);
            f4m.v(a, textView);
        }

        @Override // xsna.vif0
        public final void i6(Integer num) {
            this.n.setText(y8g0.c(R.plurals.profile_photo_tags_count, num.intValue()));
        }
    }

    /* compiled from: PhotoTagsImagesAdapter.kt */
    public static final class b extends vif0<ProfilePhotoTag> implements View.OnClickListener {
        public static final int x = y8g0.a(R.dimen.photo_tag_preview_width);
        public static final int y = y8g0.a(R.dimen.photo_tag_preview_author_image_size);
        public final nca0 n;
        public final VKImageView o;
        public final TagsSuggestionsOverlayView p;
        public final VKImageView q;
        public final TextView r;
        public final TextView s;
        public final TextView t;
        public final TextView u;
        public final TextView v;
        public final View w;

        public b(ViewGroup viewGroup, nca0 nca0Var) {
            super(viewGroup, R.layout.item_photo_tag_preview, 0);
            this.n = nca0Var;
            VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.photo_tag_preview_image_view);
            this.o = vKImageView;
            TagsSuggestionsOverlayView tagsSuggestionsOverlayView = (TagsSuggestionsOverlayView) this.itemView.findViewById(R.id.photo_tag_suggestions_view);
            this.p = tagsSuggestionsOverlayView;
            VKImageView vKImageView2 = (VKImageView) this.itemView.findViewById(R.id.photo_tag_author_image_view);
            this.q = vKImageView2;
            this.r = (TextView) this.itemView.findViewById(R.id.photo_tag_title_text);
            this.s = (TextView) this.itemView.findViewById(R.id.photo_tag_subtitle_text);
            TextView textView = (TextView) this.itemView.findViewById(R.id.photo_tag_primary_btn);
            this.t = textView;
            TextView textView2 = (TextView) this.itemView.findViewById(R.id.photo_tag_secondary_btn);
            this.u = textView2;
            this.v = (TextView) this.itemView.findViewById(R.id.photo_tag_removed_text);
            TextView textView3 = (TextView) this.itemView.findViewById(R.id.photo_tag_cancel_removed_text);
            View findViewById = this.itemView.findViewById(R.id.photo_tag_more_btn);
            this.w = findViewById;
            float b = y8g0.b(R.dimen.photo_tag_preview_background_radius);
            vKImageView.setClipToOutline(true);
            vKImageView.setOutlineProvider(new s0w0(b, false, true));
            if (gz80.a(23)) {
                vKImageView.setForeground(m33.a(R.drawable.highlight, this.itemView.getContext()));
            }
            vKImageView.setOnLoadCallback(tagsSuggestionsOverlayView);
            tagsSuggestionsOverlayView.setNameVisible(false);
            vKImageView.setOnClickListener(this);
            textView.setOnClickListener(this);
            textView2.setOnClickListener(this);
            textView3.setOnClickListener(this);
            findViewById.setOnClickListener(this);
            vKImageView2.setOnClickListener(this);
        }

        @Override // xsna.vif0
        public final void i6(ProfilePhotoTag profilePhotoTag) {
            String str;
            Image image;
            ImageSize Cb;
            ProfilePhotoTag profilePhotoTag2 = profilePhotoTag;
            if (profilePhotoTag2 == null) {
                return;
            }
            Owner owner = profilePhotoTag2.c;
            Photo photo = profilePhotoTag2.b;
            boolean z = profilePhotoTag2.l;
            int i = x;
            String str2 = photo.Fb(i, false).d.d;
            if (str2 != null) {
                this.o.load(str2);
            }
            if (profilePhotoTag2.i) {
                i = -1;
            }
            if (this.itemView.getLayoutParams().width != i) {
                this.itemView.getLayoutParams().width = i;
                this.itemView.requestLayout();
            }
            VKImageView vKImageView = this.q;
            bwt0.d0(vKImageView, z);
            TextView textView = this.r;
            bwt0.d0(textView, z);
            TextView textView2 = this.s;
            bwt0.d0(textView2, z);
            TextView textView3 = this.t;
            bwt0.d0(textView3, z);
            TextView textView4 = this.u;
            bwt0.d0(textView4, z);
            boolean z2 = !z;
            bwt0.d0(this.v, z2);
            bwt0.d0(this.w, z2);
            if (profilePhotoTag2.d) {
                vKImageView.setImageResource(R.drawable.vk_icon_stars_circle_fill_violet_32);
            } else {
                if (owner == null || (image = owner.g) == null || (Cb = image.Cb(y, true, false)) == null || (str = Cb.d.d) == null) {
                    str = owner != null ? owner.e : null;
                }
                if (str != null) {
                    vKImageView.load(str);
                }
            }
            textView.setText(profilePhotoTag2.e);
            textView2.setText(profilePhotoTag2.f);
            textView3.setText(profilePhotoTag2.g);
            textView4.setText(profilePhotoTag2.h);
            this.p.setTags(photo.b);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Owner owner;
            UserId userId;
            if (jjc.b()) {
                return;
            }
            Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
            nca0 nca0Var = this.n;
            if (valueOf != null && valueOf.intValue() == R.id.photo_tag_primary_btn) {
                if (nca0Var != null) {
                    nca0Var.F4((ProfilePhotoTag) this.m);
                    return;
                }
                return;
            }
            if (valueOf != null && valueOf.intValue() == R.id.photo_tag_secondary_btn) {
                if (nca0Var != null) {
                    nca0Var.x((ProfilePhotoTag) this.m);
                    return;
                }
                return;
            }
            if (valueOf != null && valueOf.intValue() == R.id.photo_tag_preview_image_view) {
                if (nca0Var != null) {
                    nca0Var.s2((ProfilePhotoTag) this.m);
                    return;
                }
                return;
            }
            if (valueOf != null && valueOf.intValue() == R.id.photo_tag_cancel_removed_text) {
                if (nca0Var != null) {
                    return;
                }
                return;
            }
            if (valueOf != null && valueOf.intValue() == R.id.photo_tag_more_btn) {
                int l = krv0.l(R.attr.vk_ui_icon_accent);
                View view2 = this.w;
                view2.getContext();
                e.b bVar = new e.b(view2, null, null, l, 6);
                bVar.w = R.layout.ds_internal_context_menu_item;
                VkContextMenu.c.c(bVar, R.string.profile_photo_tags_settings, null, false, null, new cty(this, 24), 30);
                bVar.j();
                return;
            }
            if (valueOf != null && valueOf.intValue() == R.id.photo_tag_author_image_view) {
                ProfilePhotoTag profilePhotoTag = (ProfilePhotoTag) this.m;
                if (profilePhotoTag.d || (owner = profilePhotoTag.c) == null || (userId = owner.b) == null) {
                    return;
                }
                gd60.Z0(hd60.a(), this.itemView.getContext(), userId, null, null, 12);
            }
        }
    }

    public mca0() {
        this(true, null);
    }

    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return super.getItemCount() + (this.h ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        Photo photo;
        ProfilePhotoTag profilePhotoTag = (ProfilePhotoTag) this.c.c(i);
        if (profilePhotoTag == null || (photo = profilePhotoTag.b) == null) {
            return -1L;
        }
        return photo.c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        if (this.h && i == getItemCount() - 1) {
            return 1;
        }
        return super.getItemViewType(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        if (e0Var instanceof b) {
            ((b) e0Var).V5(this.c.c(i));
        } else if (e0Var instanceof a) {
            ((a) e0Var).V5(Integer.valueOf(getItemCount() - 1));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != 1) {
            return new b(viewGroup, this.f);
        }
        a aVar = new a(viewGroup);
        this.g = new WeakReference<>(aVar);
        return aVar;
    }

    @Override // xsna.zoj0, xsna.uuk
    public final void setItems(List<ProfilePhotoTag> list) {
        super.setItems(list);
        this.h = this.e && !list.isEmpty();
    }

    public mca0(boolean z, kyd0 kyd0Var) {
        this.e = z;
        this.f = kyd0Var;
        this.g = new WeakReference<>(null);
        this.h = z;
        setHasStableIds(true);
    }
}
