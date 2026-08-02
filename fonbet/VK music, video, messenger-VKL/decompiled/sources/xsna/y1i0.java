package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.view.components.picture.c;
import com.vk.dto.common.Image;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import kotlin.NoWhenBranchMatchedException;
import xsna.tlo0;

/* compiled from: SectionListItem.kt */
/* loaded from: classes5.dex */
public final class y1i0 extends we6 {
    public final ExtendedCommunityProfile.Section g;
    public final d05 h;
    public final int i = -1019;

    /* compiled from: SectionListItem.kt */
    public static final class a implements VkCell.f {
        public final Image a;
        public final ExtendedCommunityProfile.Section.Type b;

        public a(Image image, ExtendedCommunityProfile.Section.Type type) {
            this.a = image;
            this.b = type;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            Image image = this.a;
            return this.b.hashCode() + ((image == null ? 0 : image.hashCode()) * 31);
        }

        public final String toString() {
            return "PictureParams(image=" + this.a + ", type=" + this.b + ')';
        }
    }

    /* compiled from: SectionListItem.kt */
    public static final class b implements VkCell.d {
        public final VkPicture a;

        /* compiled from: SectionListItem.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ExtendedCommunityProfile.Section.Type.values().length];
                try {
                    iArr[ExtendedCommunityProfile.Section.Type.Photos.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ExtendedCommunityProfile.Section.Type.Products.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ExtendedCommunityProfile.Section.Type.Discussions.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ExtendedCommunityProfile.Section.Type.Services.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ExtendedCommunityProfile.Section.Type.Channel.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ExtendedCommunityProfile.Section.Type.Narratives.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[ExtendedCommunityProfile.Section.Type.Music.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[ExtendedCommunityProfile.Section.Type.Podcasts.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[ExtendedCommunityProfile.Section.Type.Articles.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[ExtendedCommunityProfile.Section.Type.Chats.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[ExtendedCommunityProfile.Section.Type.Files.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[ExtendedCommunityProfile.Section.Type.Events.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public b(Context context) {
            VkPicture vkPicture = new VkPicture(context, null, 6, 0);
            vkPicture.setCornerRadius(VkPicture.CornerRadius.Large);
            this.a = vkPicture;
            vkPicture.setScaleType(ImageView.ScaleType.CENTER);
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            int i;
            a aVar = fVar instanceof a ? (a) fVar : null;
            if (aVar == null) {
                return;
            }
            Image image = aVar.a;
            VkPicture vkPicture = this.a;
            if (image != null) {
                bwt0.S(vkPicture, new lx60(11, this, aVar));
                return;
            }
            switch (a.$EnumSwitchMapping$0[aVar.b.ordinal()]) {
                case 1:
                    i = R.drawable.vk_icon_camera_outline_24;
                    break;
                case 2:
                    i = R.drawable.vk_icon_market_outline_24;
                    break;
                case 3:
                    i = R.drawable.vk_icon_comment_outline_24;
                    break;
                case 4:
                    i = R.drawable.vk_icon_notebook_check_outline_24;
                    break;
                case 5:
                    i = R.drawable.vk_icon_channels_outline_24;
                    break;
                case 6:
                    i = R.drawable.vk_icon_narrative_outline_24;
                    break;
                case 7:
                    i = R.drawable.vk_icon_music_outline_24;
                    break;
                case 8:
                    i = R.drawable.vk_icon_podcast_24;
                    break;
                case 9:
                    i = R.drawable.vk_icon_article_24;
                    break;
                case 10:
                    i = R.drawable.vk_icon_messages_outline_24;
                    break;
                case 11:
                    i = R.drawable.vk_icon_document_outline_24;
                    break;
                case 12:
                    i = R.drawable.vk_icon_calendar_outline_24;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            vkPicture.setContent(new c.a(i, R.attr.vk_ui_icon_tertiary));
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: SectionListItem.kt */
    public static final class c implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new b(context);
        }
    }

    /* compiled from: SectionListItem.kt */
    public static final class d extends vif0<y1i0> {
        public final VkCell n;

        /* compiled from: SectionListItem.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ExtendedCommunityProfile.Section.Type.values().length];
                try {
                    iArr[ExtendedCommunityProfile.Section.Type.Photos.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ExtendedCommunityProfile.Section.Type.Products.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ExtendedCommunityProfile.Section.Type.Discussions.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ExtendedCommunityProfile.Section.Type.Services.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ExtendedCommunityProfile.Section.Type.Channel.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ExtendedCommunityProfile.Section.Type.Narratives.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[ExtendedCommunityProfile.Section.Type.Music.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[ExtendedCommunityProfile.Section.Type.Podcasts.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[ExtendedCommunityProfile.Section.Type.Articles.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[ExtendedCommunityProfile.Section.Type.Chats.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[ExtendedCommunityProfile.Section.Type.Files.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[ExtendedCommunityProfile.Section.Type.Events.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public d(ViewGroup viewGroup) {
            super(r0);
            VkCell vkCell = new VkCell(viewGroup.getContext(), null, 6, 0);
            vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            VkCell vkCell2 = (VkCell) this.itemView;
            this.n = vkCell2;
            vkCell2.setLeftMainPictureController(new c());
            vkCell2.setOnClickListener(new c98(this, 12));
        }

        @Override // xsna.vif0
        public final void i6(y1i0 y1i0Var) {
            ExtendedCommunityProfile.Section section;
            int i;
            y1i0 y1i0Var2 = y1i0Var;
            if (y1i0Var2 == null || (section = y1i0Var2.g) == null) {
                return;
            }
            ExtendedCommunityProfile.Section.Type type = section.b;
            VkCell.Left.b a2 = VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.d(new a(section.a, type), VkCell.Left.Main.Size.Medium));
            VkCell vkCell = this.n;
            vkCell.setLeft(a2);
            VkCell.Middle.a aVar = VkCell.Middle.Companion;
            tlo0.a aVar2 = tlo0.Companion;
            switch (a.$EnumSwitchMapping$0[type.ordinal()]) {
                case 1:
                    i = R.string.community_section_title_photos;
                    break;
                case 2:
                    i = R.string.community_section_title_products;
                    break;
                case 3:
                    i = R.string.community_section_title_discussions;
                    break;
                case 4:
                    i = R.string.community_section_title_services;
                    break;
                case 5:
                    i = R.string.community_section_title_channel;
                    break;
                case 6:
                    i = R.string.community_section_title_narratives;
                    break;
                case 7:
                    i = R.string.community_section_title_music;
                    break;
                case 8:
                    i = R.string.community_section_title_podcasts;
                    break;
                case 9:
                    i = R.string.community_section_title_articles;
                    break;
                case 10:
                    i = R.string.community_section_title_chats;
                    break;
                case 11:
                    i = R.string.community_section_title_files;
                    break;
                case 12:
                    i = R.string.community_section_title_events;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            vkCell.setMiddle(VkCell.Middle.a.a(aVar, new VkCell.Middle.e(tq.h(aVar2, i), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), null, null, 14));
        }
    }

    public y1i0(ExtendedCommunityProfile.Section section, d05 d05Var) {
        this.g = section;
        this.h = d05Var;
    }

    @Override // xsna.we6
    public final vif0 a(ViewGroup viewGroup) {
        return new d(viewGroup);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!y1i0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        y1i0 y1i0Var = (y1i0) obj;
        return this.i == y1i0Var.i && epx.f(this.g, y1i0Var.g);
    }

    @Override // xsna.we6
    public final int h() {
        return this.i;
    }

    public final int hashCode() {
        return this.g.hashCode() + (this.i * 31);
    }
}
