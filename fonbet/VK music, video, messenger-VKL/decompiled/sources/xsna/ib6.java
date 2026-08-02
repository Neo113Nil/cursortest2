package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.view.FrameLayoutSwiped;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.user.ImageStatus;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.api.data.TypeReply;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AudioArtistAttachment;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vkontakte.android.attachments.AudioCuratorAttachment;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import com.vkontakte.android.attachments.BookingAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.DonutLinkAttachment;
import com.vkontakte.android.attachments.GeoAttachment;
import com.vkontakte.android.attachments.GraffitiAttachment;
import com.vkontakte.android.attachments.LinkAttachment;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vkontakte.android.attachments.NarrativeAttachment;
import com.vkontakte.android.attachments.NoteAttachment;
import com.vkontakte.android.attachments.PodcastAttachment;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.attachments.PrettyCardAttachment;
import com.vkontakte.android.attachments.StickerAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.attachments.WikiAttachment;
import java.util.ArrayList;
import java.util.regex.Pattern;
import xsna.am;
import xsna.e3m;
import xsna.gd60;

/* compiled from: BaseCommentViewHolder.kt */
/* loaded from: classes4.dex */
public abstract class ib6 extends aa implements View.OnClickListener, FrameLayoutSwiped.a, p2f0, a4g0, seg {
    public static final int R = cn70.b(20);
    public static final int S = iah0.a(8.0f);
    public static final int T = iah0.a(12.0f);
    public final TextView A;
    public final ViewGroup B;
    public final View C;
    public final FrameLayoutSwiped D;
    public final TextView E;
    public final View F;
    public final View G;
    public final TextView H;
    public int I;
    public boolean J;
    public final String K;
    public final String L;
    public boolean M;
    public boolean N;
    public s980 O;
    public final oag P;
    public final bg0 Q;
    public final tdg o;
    public final g3f0 p;
    public final qag q;
    public final View r;
    public final View s;
    public final TextView t;
    public final View u;
    public final View v;
    public final VkImage w;
    public final TextView x;
    public final TextView y;
    public final ViewGroup z;

    /* compiled from: BaseCommentViewHolder.kt */
    public static final class a {
        public static FrameLayoutSwiped a(int i, ViewGroup viewGroup) {
            Context context = viewGroup.getContext();
            FrameLayoutSwiped frameLayoutSwiped = new FrameLayoutSwiped(context);
            frameLayoutSwiped.setId(R.id.wrapper);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundResource(R.drawable.inline_comments_reply_marker);
            frameLayoutSwiped.addView(frameLayout);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.width = iah0.a(48.0f);
            layoutParams.height = -1;
            layoutParams.gravity = 8388613;
            View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) frameLayoutSwiped, false);
            inflate.setBackgroundResource(R.drawable.highlight_white);
            inflate.setId(R.id.container);
            frameLayoutSwiped.addView(inflate);
            if (viewGroup instanceof RecyclerView) {
                frameLayoutSwiped.setLayoutParams(new RecyclerView.p(-1, -2));
            }
            return frameLayoutSwiped;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ib6(int i, ViewGroup viewGroup, tdg tdgVar, g3f0 g3f0Var) {
        super(a.a(i, viewGroup), viewGroup);
        this.o = tdgVar;
        this.p = g3f0Var;
        qag qagVar = (qag) this.itemView.findViewById(R.id.poster_photo);
        this.q = qagVar;
        View findViewById = this.itemView.findViewById(R.id.author_badge);
        this.r = findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.comment_reply);
        this.s = findViewById2;
        TextView textView = (TextView) this.itemView.findViewById(R.id.poster_name);
        this.t = textView;
        View findViewById3 = this.itemView.findViewById(R.id.icon1);
        this.u = findViewById3;
        this.v = this.itemView.findViewById(R.id.icon2);
        VkImage vkImage = (VkImage) this.itemView.findViewById(R.id.status);
        this.w = vkImage;
        this.x = (TextView) this.itemView.findViewById(R.id.reply_to_name);
        this.y = (TextView) this.itemView.findViewById(R.id.post_info_view);
        this.z = (ViewGroup) this.itemView.findViewById(R.id.post_view);
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.text);
        this.A = textView2;
        ViewGroup viewGroup2 = (ViewGroup) this.itemView.findViewById(R.id.post_attach_container);
        this.B = viewGroup2;
        View findViewById4 = this.itemView.findViewById(R.id.container);
        this.C = findViewById4;
        FrameLayoutSwiped frameLayoutSwiped = (FrameLayoutSwiped) this.itemView.findViewById(R.id.wrapper);
        this.D = frameLayoutSwiped;
        this.E = (TextView) this.itemView.findViewById(R.id.comment_author);
        this.F = this.itemView.findViewById(R.id.pinned_badge);
        this.G = this.itemView.findViewById(R.id.pinned_dot);
        this.H = (TextView) this.itemView.findViewById(R.id.post_likes);
        this.I = R.color.post_counters;
        this.K = " · " + b6().getString(R.string.comment_author);
        this.L = " · " + b6().getString(R.string.comment_channel_author);
        this.M = true;
        oag oagVar = new oag(tdgVar);
        if (viewGroup2 != null) {
            oagVar.d = viewGroup2;
        }
        this.P = oagVar;
        this.Q = new bg0(this, 1);
        textView2.setTextSize(2, 15.0f);
        (qagVar instanceof View ? (View) qagVar : qagVar.getView()).setOnClickListener(this);
        textView.setOnClickListener(this);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(this);
        }
        findViewById4.setOnClickListener(this);
        vkImage.setOnClickListener(this);
        bwt0.X(R.drawable.vk_icon_donut_color_12, findViewById3);
        if (findViewById != null) {
            bwt0.X(R.drawable.vk_icon_star_circle_fill_blue_16, findViewById);
        }
        frameLayoutSwiped.setCallback(this);
    }

    public static final void x6(ib6 ib6Var) {
        TextView textView = ib6Var.E;
        if (textView != null) {
            Context context = ib6Var.itemView.getContext();
            e3m.a aVar = e3m.a;
            textView.setTextColor(context.getColor(R.color.vk_ui_text_title_color));
        }
        ib6Var.t.setTextAppearance(R.style.VkUiTypography_FootnoteSemiBold);
        if (textView != null) {
            textView.setTextAppearance(R.style.VkUiTypography_Caption1);
        }
        if (textView != null) {
            bwt0.p0(textView, true);
        }
    }

    public String A6(iag iagVar) {
        return b6().getInteger(R.integer.comment_short_date_format) == 1 ? pvo0.l(iagVar.C()) : pvo0.i(false, iagVar.C(), false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x051a  */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vif0
    /* renamed from: B6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i6(iag iagVar) {
        tdg tdgVar;
        int i;
        View view;
        boolean h0;
        int i2;
        boolean z;
        View view2;
        View view3;
        NewsComment newsComment;
        boolean z2;
        bbg bbgVar;
        int i3;
        zsj0 zsj0Var;
        int i4;
        int i5;
        int i6;
        Object obj;
        Image image;
        ImageSize Ab;
        ViewGroup viewGroup = this.z;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
        }
        FrameLayoutSwiped frameLayoutSwiped = this.D;
        Object tag = frameLayoutSwiped.getTag(R.id.tag_comment_highlight);
        Object obj2 = null;
        if (tag instanceof Runnable) {
            frameLayoutSwiped.removeCallbacks((Runnable) tag);
            frameLayoutSwiped.setTag(null);
            e5v.b(frameLayoutSwiped, null);
        }
        v6();
        int itemViewType = getItemViewType();
        qag qagVar = this.q;
        ViewGroup.LayoutParams layoutParams2 = qagVar.getView().getLayoutParams();
        if ((itemViewType == 421 || itemViewType == 447) && (layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).setMarginStart(b6().getDimensionPixelSize(R.dimen.comment_reply_small_margin_start));
        }
        qagVar.load(iagVar.va());
        View view4 = qagVar.getView();
        iut0.o(view4, am.a.e, fkq0.d(iagVar.getUid()) ? g6(R.string.accessibility_open_profile) : g6(R.string.accessibility_open_community), null);
        view4.setContentDescription(iagVar.y1());
        int id = iagVar.getId();
        CharSequence X3 = iagVar.X3();
        tdg tdgVar2 = this.o;
        CharSequence mb = tdgVar2.mb(id, X3);
        TextView textView = this.A;
        textView.setText(mb);
        Pattern pattern = n420.a;
        viewGroup.setContentDescription(n420.b(iagVar.getText()));
        String y1 = iagVar.y1();
        TextView textView2 = this.t;
        textView2.setText(y1);
        VerifyInfo Y = iagVar.Y();
        int i7 = 0;
        View view5 = this.v;
        if (Y == null || !Y.Cb()) {
            f4m.j(view5);
        } else {
            VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
            view5.setBackground(VerifyInfoHelper.f(this.l.getContext(), VerifyInfoHelper.ColorTheme.normal, Y));
            view5.setVisibility(0);
        }
        ImageStatus l5 = iagVar.l5();
        String str = (l5 == null || (image = l5.d) == null || (Ab = image.Ab(R, false)) == null) ? null : Ab.d.d;
        VkImage vkImage = this.w;
        vkImage.o0(str, null);
        vkImage.setContentDescription(l5 != null ? l5.c : null);
        bwt0.p0(vkImage, l5 != null);
        String Z4 = iagVar.Z4();
        TextView textView3 = this.x;
        if (Z4 != null) {
            if (textView3 != null) {
                textView3.setText(h6(R.string.comment_reply_to_name_format, Z4));
            }
            if (textView3 != null) {
                bwt0.p0(textView3, true);
            }
        } else if (textView3 != null) {
            bwt0.p0(textView3, false);
        }
        CharSequence X32 = iagVar.X3();
        String A6 = A6(iagVar);
        TextView textView4 = this.y;
        textView4.setText(A6);
        textView4.setContentDescription(pvo0.i(false, iagVar.C(), false, false));
        bwt0.p0(textView, myc0.f(X32));
        boolean isEmpty = iagVar.u().isEmpty();
        ViewGroup viewGroup2 = this.B;
        if (isEmpty) {
            tdgVar = tdgVar2;
            if (viewGroup2 != null) {
                i = 0;
                bwt0.p0(viewGroup2, false);
                this.C.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                if (X32 instanceof Spannable) {
                    Spannable spannable = (Spannable) X32;
                    x7q x7qVar = (x7q) rl3.O((x7q[]) spannable.getSpans(i, spannable.length(), x7q.class));
                    if (x7qVar != null) {
                        x7qVar.m = this.Q;
                    }
                }
                bwt0.p0(this.u, iagVar.K8());
                int itemViewType2 = getItemViewType();
                view = this.r;
                if (view != null) {
                    bwt0.p0(view, itemViewType2 == 433 && epx.f(iagVar.getUid(), tdgVar.p()));
                }
                E6(iagVar);
                h0 = fxc0.B().J().h0();
                String str2 = this.K;
                TextView textView5 = this.E;
                if (!h0) {
                    Context context = this.itemView.getContext();
                    e3m.a aVar = e3m.a;
                    textView2.setTextColor(context.getColor(R.color.vk_ui_text_title_color));
                    boolean z3 = iagVar instanceof NewsComment;
                    if (z3 && ((NewsComment) iagVar).A) {
                        x6(this);
                        if (textView5 != null) {
                            textView5.setText(str2);
                        }
                    } else if (z3 && fkq0.b(((NewsComment) iagVar).j)) {
                        x6(this);
                        if (textView5 != null) {
                            textView5.setText(this.L);
                        }
                    } else if (textView5 != null) {
                        bwt0.p0(textView5, false);
                    }
                } else if ((iagVar instanceof NewsComment) && ((NewsComment) iagVar).A) {
                    if (textView5 != null) {
                        textView5.setText(str2);
                    }
                    if (textView5 != null) {
                        textView5.setTextAppearance(R.style.VkUiTypography_Footnote);
                    }
                    if (textView5 != null) {
                        bwt0.p0(textView5, true);
                    }
                } else if (textView5 != null) {
                    i2 = 0;
                    bwt0.p0(textView5, false);
                    z = iagVar instanceof NewsComment;
                    view2 = this.G;
                    view3 = this.F;
                    if (z || !((NewsComment) iagVar).D) {
                        if (view2 != null) {
                            view2.setVisibility(i2);
                        }
                        if (view3 != null) {
                            f4m.j(view3);
                        }
                    } else {
                        if (view3 != null) {
                            view3.setVisibility(i2);
                        }
                        if (view2 != null) {
                            view2.setVisibility(i2);
                        }
                    }
                    newsComment = z ? (NewsComment) iagVar : null;
                    if ((newsComment != null ? newsComment.t : i2) != 0) {
                        cbg cbgVar = this.n;
                        if (((cbgVar == null || (bbgVar = cbgVar.e) == null || !bbgVar.b) ? i2 : 1) != 0) {
                            z2 = 1;
                            this.N = z2;
                            bwt0.p0(this.H, !z2);
                        }
                    }
                    z2 = i2;
                    this.N = z2;
                    bwt0.p0(this.H, !z2);
                }
                i2 = 0;
                z = iagVar instanceof NewsComment;
                view2 = this.G;
                view3 = this.F;
                if (z) {
                }
                if (view2 != null) {
                }
                if (view3 != null) {
                }
                if (z) {
                }
                if ((newsComment != null ? newsComment.t : i2) != 0) {
                }
                z2 = i2;
                this.N = z2;
                bwt0.p0(this.H, !z2);
            }
        } else {
            s980 s980Var = this.O;
            oag oagVar = this.P;
            oagVar.h = s980Var;
            oagVar.e = iagVar;
            oagVar.f = iagVar.u();
            zsj0 zsj0Var2 = oagVar.c;
            ArrayList<RecyclerView.e0> arrayList = oagVar.g;
            ViewGroup viewGroup3 = oagVar.d;
            if (viewGroup3 != null) {
                viewGroup3.removeAllViews();
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    RecyclerView.e0 e0Var = arrayList.get(size);
                    if (e0Var instanceof qi6) {
                        qi6 qi6Var = (qi6) e0Var;
                        qi6Var.O6(null);
                        qi6Var.M6(t980.a);
                    }
                    zsj0Var2.b(e0Var);
                }
                arrayList.clear();
                ArrayList arrayList2 = oagVar.f;
                if (arrayList2 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList<MusicTrack> arrayList4 = new ArrayList<>();
                    for (int size2 = arrayList2.size(); i7 < size2; size2 = i6) {
                        Attachment attachment = (Attachment) arrayList2.get(i7);
                        tdg tdgVar3 = tdgVar2;
                        if (attachment instanceof eso0) {
                            arrayList3.add(attachment);
                            i5 = i7;
                        } else {
                            i5 = i7;
                            if (attachment instanceof DocumentAttachment) {
                                if (((DocumentAttachment) attachment).Ib()) {
                                    arrayList3.add(attachment);
                                }
                            } else if (attachment instanceof AudioAttachment) {
                                AudioAttachment audioAttachment = (AudioAttachment) attachment;
                                audioAttachment.h = "comments";
                                i6 = size2;
                                audioAttachment.i = null;
                                arrayList4.size();
                                arrayList4.add(audioAttachment.f);
                                audioAttachment.g = arrayList4;
                                if (attachment instanceof VideoAttachment) {
                                    obj = null;
                                } else {
                                    obj = null;
                                    ((VideoAttachment) attachment).Lb("comments", null, null);
                                }
                                i7 = i5 + 1;
                                obj2 = obj;
                                tdgVar2 = tdgVar3;
                            }
                        }
                        i6 = size2;
                        if (attachment instanceof VideoAttachment) {
                        }
                        i7 = i5 + 1;
                        obj2 = obj;
                        tdgVar2 = tdgVar3;
                    }
                    tdgVar = tdgVar2;
                    if (!arrayList3.isEmpty()) {
                        RecyclerView.e0 a2 = zsj0Var2.a(5);
                        if (a2 == null) {
                            a2 = oagVar.a(5, viewGroup3);
                        }
                        if (a2 instanceof qi6) {
                            qi6 qi6Var2 = (qi6) a2;
                            qi6Var2.O6(oagVar.h);
                            s980 s980Var2 = oagVar.h;
                            if (s980Var2 != null) {
                                qi6Var2.M6(s980Var2);
                            }
                        }
                        if (a2 instanceof gfu) {
                            arrayList.add(a2);
                            gfu gfuVar = (gfu) a2;
                            viewGroup3.addView(gfuVar.itemView);
                            com.vk.movika.sdk.base.logic.interactor.e eVar = new com.vk.movika.sdk.base.logic.interactor.e(oagVar, 20);
                            gfuVar.F = arrayList3;
                            gfuVar.K = eVar;
                            gfuVar.R6();
                            gfuVar.itemView.setPadding(0, 0, 0, 0);
                        }
                    }
                    int i8 = 0;
                    for (int size3 = arrayList2.size(); i8 < size3; size3 = i4) {
                        Object obj3 = (T) arrayList2.get(i8);
                        if (arrayList3.contains(obj3)) {
                            zsj0Var = zsj0Var2;
                        } else {
                            ((nag) oagVar.i.getValue()).getClass();
                            if (obj3 instanceof AudioPlaylistAttachment) {
                                i3 = 45;
                            } else if (obj3 instanceof StickerAttachment) {
                                i3 = ((StickerAttachment) obj3).V0() ? 67 : 66;
                            } else if (obj3 instanceof DocumentAttachment) {
                                DocumentAttachment documentAttachment = (DocumentAttachment) obj3;
                                if (documentAttachment.x5() && documentAttachment.V0()) {
                                    i3 = 7;
                                } else {
                                    Image image2 = documentAttachment.s;
                                    i3 = (image2 == null || image2.b.isEmpty()) ? 39 : 11;
                                }
                            } else if (obj3 instanceof AudioAttachment) {
                                i3 = 6;
                            } else if (obj3 instanceof LinkAttachment) {
                                i3 = 43;
                            } else if (obj3 instanceof SnippetAttachment) {
                                i3 = ((SnippetAttachment) obj3).t ? 83 : 42;
                            } else if (obj3 instanceof ArticleAttachment) {
                                i3 = ((ArticleAttachment) obj3).h ? 47 : 48;
                            } else if (obj3 instanceof PollAttachment) {
                                i3 = 40;
                            } else if (obj3 instanceof AudioArtistAttachment) {
                                i3 = 76;
                            } else if (obj3 instanceof AudioCuratorAttachment) {
                                i3 = 143;
                            } else if (obj3 instanceof MarketAttachment) {
                                i3 = ((MarketAttachment) obj3).f.Cb() ? 245 : 46;
                            } else if (obj3 instanceof NoteAttachment) {
                                i3 = 54;
                            } else if (obj3 instanceof WikiAttachment) {
                                i3 = 44;
                            } else if (obj3 instanceof GeoAttachment) {
                                int i9 = ((GeoAttachment) obj3).l;
                                i3 = i9 != 1 ? i9 != 2 ? 35 : 34 : 33;
                            } else {
                                i3 = obj3 instanceof PrettyCardAttachment ? 49 : obj3 instanceof GraffitiAttachment ? 68 : obj3 instanceof PodcastAttachment ? !((PodcastAttachment) obj3).f.B() ? 70 : 96 : obj3 instanceof NarrativeAttachment ? 77 : obj3 instanceof DonutLinkAttachment ? 148 : obj3 instanceof BookingAttachment ? 297 : -1;
                            }
                            RecyclerView.e0 a3 = zsj0Var2.a(i3);
                            if (a3 == null) {
                                a3 = oagVar.a(i3, viewGroup3);
                            }
                            if (a3 instanceof qi6) {
                                zsj0Var = zsj0Var2;
                                ((qi6) a3).O6(oagVar.h);
                            } else {
                                zsj0Var = zsj0Var2;
                            }
                            if (a3 instanceof m56) {
                                arrayList.add(a3);
                                m56 m56Var = (m56) a3;
                                viewGroup3.addView(m56Var.itemView);
                                m56Var.O6(oagVar.h);
                                if (oagVar.h == null) {
                                    m56Var.i6();
                                }
                                if ((m56Var instanceof do6) && (obj3 instanceof StickerAttachment)) {
                                    do6 do6Var = (do6) m56Var;
                                    StickerAttachment stickerAttachment = (StickerAttachment) obj3;
                                    iag iagVar2 = oagVar.e;
                                    UserId uid = iagVar2 != null ? iagVar2.getUid() : null;
                                    i4 = size3;
                                    do6Var.D = oagVar.b;
                                    do6Var.E = uid;
                                    do6Var.R6(stickerAttachment);
                                } else {
                                    i4 = size3;
                                    T t = obj3;
                                    if (obj3 == null) {
                                        t = 0;
                                    }
                                    m56Var.C = t;
                                    if (t != 0) {
                                        m56Var.T6(t);
                                    }
                                }
                                if (m56Var instanceof ikg) {
                                    m56Var.itemView.setPadding(0, 0, 0, cn70.b(4));
                                } else if (m56Var instanceof p0o) {
                                    m56Var.itemView.setPadding(0, 0, 0, cn70.b(7));
                                } else {
                                    m56Var.itemView.setPadding(0, 0, 0, 0);
                                }
                                i8++;
                                zsj0Var2 = zsj0Var;
                            }
                        }
                        i4 = size3;
                        i8++;
                        zsj0Var2 = zsj0Var;
                    }
                    if (viewGroup2 != null) {
                        bwt0.p0(viewGroup2, true);
                    }
                }
            }
            tdgVar = tdgVar2;
            if (viewGroup2 != null) {
            }
        }
        i = 0;
        this.C.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (X32 instanceof Spannable) {
        }
        bwt0.p0(this.u, iagVar.K8());
        int itemViewType22 = getItemViewType();
        view = this.r;
        if (view != null) {
        }
        E6(iagVar);
        h0 = fxc0.B().J().h0();
        String str22 = this.K;
        TextView textView52 = this.E;
        if (!h0) {
        }
        i2 = 0;
        z = iagVar instanceof NewsComment;
        view2 = this.G;
        view3 = this.F;
        if (z) {
        }
        if (view2 != null) {
        }
        if (view3 != null) {
        }
        if (z) {
        }
        if ((newsComment != null ? newsComment.t : i2) != 0) {
        }
        z2 = i2;
        this.N = z2;
        bwt0.p0(this.H, !z2);
    }

    public final void D6(TextView textView) {
        abg0 abg0Var = dhr0.t;
        int c = abg0Var.c(R.attr.vk_ui_text_negative);
        int c2 = abg0Var.c(R.attr.vk_ui_icon_secondary);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_selected}, new baf0(m33.a(R.drawable.vk_icon_like_16, textView.getContext()), c));
        stateListDrawable.addState(new int[0], new baf0(m33.a(R.drawable.vk_icon_like_outline_16, textView.getContext()), c2));
        if (b6().getConfiguration().getLayoutDirection() == 1) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, stateListDrawable, (Drawable) null);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(stateListDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public void E6(iag iagVar) {
        if (this.m != iagVar) {
            return;
        }
        int T9 = iagVar.T9();
        ColorStateList b = anj.b(this.I, this.itemView.getContext());
        TextView textView = this.H;
        textView.setTextColor(b);
        if (T9 > 0) {
            textView.setSelected(iagVar.J());
            textView.setText(uqm0.f(T9));
            textView.setCompoundDrawablePadding(cn70.b(4));
            textView.setContentDescription(a6(R.plurals.accessibility_likes, T9, Integer.valueOf(T9)));
            return;
        }
        textView.setSelected(iagVar.J());
        textView.setText((CharSequence) null);
        textView.setCompoundDrawablePadding(0);
        textView.setContentDescription(g6(R.string.accessibility_like));
    }

    @Override // xsna.a4g0
    public aa P3(boolean z) {
        boolean z2 = false;
        this.M = z && !this.N;
        View view = this.s;
        if (view != null) {
            if (z && !this.N) {
                z2 = true;
            }
            bwt0.p0(view, z2);
        }
        return this;
    }

    @Override // xsna.seg
    public final void Q4(s980 s980Var) {
        this.O = s980Var;
        this.P.h = s980Var;
    }

    @Override // xsna.p2f0
    public final void T1(u5f0 u5f0Var, ReactionMeta reactionMeta, a2f0 a2f0Var) {
        Object obj = u5f0Var.a;
        if (obj != this.m) {
            return;
        }
        iag iagVar = (iag) obj;
        E6(iagVar);
        this.o.N3(iagVar, this, reactionMeta, false);
    }

    @Override // com.vk.core.tool.view.FrameLayoutSwiped.a
    public final boolean Z() {
        return this.M && !this.N;
    }

    @Override // com.vk.core.tool.view.FrameLayoutSwiped.a
    public final void c0() {
        this.o.ei((iag) this.m, TypeReply.Swipe);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ImageStatus l5;
        if (jjc.b()) {
            return;
        }
        int id = view.getId();
        tdg tdgVar = this.o;
        if (id == R.id.post_badge_container || id == R.id.comment_donut_small_badge || id == R.id.comment_donut_large_badge) {
            iag iagVar = (iag) this.m;
            if (iagVar == null || iagVar.G6() == null) {
                return;
            }
            tdgVar.nc();
            return;
        }
        if (id == R.id.comment_reply) {
            tdgVar.ei((iag) this.m, TypeReply.Click);
            return;
        }
        if (id == R.id.poster_name || id == R.id.poster_photo) {
            iag iagVar2 = (iag) this.m;
            gd60 a2 = hd60.a();
            Context context = this.l.getContext();
            UserId uid = iagVar2.getUid();
            iagVar2.u4();
            a2.g(context, uid, (r16 & 4) != 0 ? null : null, (r16 & 8) != 0 ? null : null, (r16 & 16) != 0 ? null : null, new gd60.b(iagVar2.y1(), iagVar2.va(), iagVar2.g6(), iagVar2.r3(), null, null, 112));
            return;
        }
        if (id == R.id.container || id == R.id.show_more) {
            tdgVar.gm((iag) this.m, this);
            return;
        }
        if (id == R.id.status) {
            iag iagVar3 = (iag) this.m;
            if (iagVar3 == null || (l5 = iagVar3.l5()) == null) {
                return;
            }
            hd60.a().R0(this.itemView.getContext(), iagVar3.getUid(), l5);
            return;
        }
        if (id == R.id.post_likes) {
            bpn0 bpn0Var = o25.a;
            if (bpn0Var == null) {
                bpn0Var = null;
            }
            b25 b25Var = (b25) bpn0Var.getValue();
            this.itemView.getContext();
            b25Var.getClass();
            iag iagVar4 = (iag) this.m;
            if (iagVar4 == null) {
                return;
            }
            if (this.J) {
                view.performHapticFeedback(0);
            }
            x6f0 x6f0Var = this.p.a;
            xx1 xx1Var = x6f0Var.d;
            x6f0Var.g.getClass();
            x6f0Var.c.a(view.getContext(), this, null, new u5f0(iagVar4, iagVar4, null, null), false);
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((iag) this.m) == null) {
            return false;
        }
        Rect d = w11.d(view);
        s3q0 s3q0Var = s3q0.a;
        ra raVar = new ra(view, 7);
        Object obj = this.m;
        return this.p.b(view, d, this, raVar, motionEvent, obj, obj, null, false);
    }

    @Override // xsna.p2f0
    public final boolean r4(Object obj) {
        return this.m == obj;
    }

    @Override // xsna.aa
    public final void s6() {
        e5v.a(this.D);
        awt0.s(this.A, new sa0(this, 11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.aa
    public final void t6() {
        boolean a4 = this.o.a4(this.n);
        T t = this.m;
        if (t instanceof NewsComment) {
            a4 = !((iag) t).i3() && a4;
        }
        View view = this.itemView;
        view.setAlpha(a4 ? 1.0f : 0.4f);
        if (view instanceof c0n) {
            ((c0n) view).setTouchEnabled(a4);
        }
    }

    public void v6() {
        f4m.v(getLayoutPosition() == 0 ? S : T, this.C);
    }

    @Override // xsna.p2f0
    public final void S4(boolean z) {
    }
}
