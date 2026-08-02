package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.common.view.SolidColorView;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.dto.articles.Article;
import com.vk.dto.articles.ArticleDonut;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.common.LinkButton;
import com.vk.dto.newsfeed.Owner;
import com.vk.fave.entities.FaveEntry;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: ArticleHolder.kt */
/* loaded from: classes4.dex */
public abstract class oo3 extends m56<ArticleAttachment> implements View.OnClickListener, blc0 {
    public static final int X;
    public static final z8m0 Y;
    public final VKImageView D;
    public final SolidColorView E;
    public final LinearLayout F;
    public final ViewGroup G;
    public final TextView H;
    public final TextView I;
    public final ViewGroup J;
    public final LinearLayout K;
    public final ImageView L;
    public final TextView M;
    public final ImageView N;
    public final View O;
    public final ImageView P;
    public final TextView Q;
    public final FrameLayout R;
    public final mo3 S;
    public View.OnClickListener T;
    public e6o U;
    public e6o V;
    public e6o W;

    static {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        X = context.getColor(R.color.vk_gray_50);
        Y = new z8m0(25, 200);
    }

    public oo3(int i, ViewGroup viewGroup) {
        super(i, viewGroup);
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.iv_article_image);
        this.D = vKImageView;
        SolidColorView solidColorView = (SolidColorView) this.itemView.findViewById(R.id.color_overlay);
        this.E = solidColorView;
        this.F = (LinearLayout) this.itemView.findViewById(R.id.ll_available_layout);
        this.G = (ViewGroup) this.itemView.findViewById(R.id.fl_article_deleted);
        this.H = (TextView) this.itemView.findViewById(R.id.tv_title);
        this.I = (TextView) this.itemView.findViewById(R.id.tv_author_name);
        this.J = (ViewGroup) this.itemView.findViewById(R.id.fl_read);
        this.K = (LinearLayout) this.itemView.findViewById(R.id.ll_blocked_layout);
        this.L = (ImageView) this.itemView.findViewById(R.id.iv_block_reason);
        this.M = (TextView) this.itemView.findViewById(R.id.tv_block_title);
        this.N = (ImageView) this.itemView.findViewById(R.id.iv_article_toggle_fave);
        this.O = this.itemView.findViewById(R.id.attach_article_remove_button);
        this.P = (ImageView) this.itemView.findViewById(R.id.read_icon);
        this.Q = (TextView) this.itemView.findViewById(R.id.read_button);
        this.R = (FrameLayout) this.itemView.findViewById(R.id.fl_listen);
        this.S = new mo3(this, 0);
        solidColorView.setCornerRadius(gbg0.a(this.itemView.getResources(), 4.0f));
        dek0.b(vKImageView, null, null, 6);
        X6();
    }

    @Override // xsna.blc0
    public final void D1(boolean z) {
        bwt0.p0(this.O, z);
        ImageView imageView = this.N;
        if (imageView != null) {
            bwt0.p0(imageView, (!hd60.a().D() || (q6() instanceof FaveEntry) || (t6() instanceof FaveEntry) || z) ? false : true);
        }
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        ba baVar = s6oVar.e;
        this.U = s6oVar.a(this, baVar);
        this.V = s6oVar.a(this.S, baVar);
        View.OnClickListener onClickListener = this.T;
        this.W = onClickListener != null ? s6oVar.a(onClickListener, baVar) : null;
        X6();
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0033, code lost:
    
        if (android.text.TextUtils.isEmpty(r5 != null ? r5.f(200) : null) == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01eb  */
    @Override // xsna.m56
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T6(ArticleAttachment articleAttachment) {
        boolean i;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        VKImageView vKImageView;
        boolean Q8;
        ArticleDonut.Placeholder placeholder;
        LinkButton linkButton;
        String str;
        ArticleDonut.Placeholder placeholder2;
        ArticleAttachment articleAttachment2 = articleAttachment;
        Article article = articleAttachment2.f;
        boolean d = article.d();
        ArticleDonut articleDonut = article.q;
        Owner owner = article.h;
        String h9 = articleAttachment2.h9();
        boolean g = article.g();
        SolidColorView solidColorView = this.E;
        if (g || d) {
            if (TextUtils.isEmpty(h9)) {
            }
            if (article.g() || d) {
                solidColorView.setColor(2130706432);
            } else {
                solidColorView.setColor(-868401859);
            }
            this.itemView.setEnabled(!article.g() || d);
            i = article.i();
            linearLayout = this.F;
            linearLayout2 = this.K;
            vKImageView = this.D;
            if (!i || article.Q8() || (article.k() && !d)) {
                vKImageView.setVisibility(4);
                linearLayout2.setVisibility(0);
                linearLayout.setVisibility(8);
                Q8 = article.Q8();
                TextView textView = this.M;
                ImageView imageView = this.L;
                if (!Q8) {
                    imageView.setImageResource(R.drawable.ic_article_protected_72);
                    textView.setText(R.string.article_protected);
                } else if (article.k()) {
                    imageView.setImageResource(R.drawable.ic_article_protected_72);
                    textView.setText(R.string.article_paid);
                } else {
                    imageView.setImageResource(R.drawable.ic_article_blocked_72);
                    textView.setText(R.string.article_banned);
                }
            } else {
                linearLayout2.setVisibility(8);
                linearLayout.setVisibility(0);
                String str2 = article.f;
                TextView textView2 = this.H;
                textView2.setText(str2);
                TextView textView3 = this.I;
                if (textView3 != null) {
                    if (d) {
                        if (articleDonut != null && (placeholder2 = articleDonut.c) != null) {
                            str = placeholder2.b;
                            textView3.setText(str);
                        }
                        str = null;
                        textView3.setText(str);
                    } else {
                        if (owner != null) {
                            str = owner.c;
                            textView3.setText(str);
                        }
                        str = null;
                        textView3.setText(str);
                    }
                }
                if (d) {
                    if (textView3 != null) {
                        textView3.setSingleLine(false);
                    }
                    if (textView3 != null) {
                        textView3.setMaxLines(2);
                    }
                } else if (textView3 != null) {
                    textView3.setSingleLine(true);
                }
                if (d) {
                    if (textView3 != null) {
                        textView3.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                } else if (textView3 != null) {
                    VerifyInfoHelper.a.l(textView3, owner != null ? owner.f : null, true, VerifyInfoHelper.ColorTheme.white);
                }
                FrameLayout frameLayout = this.R;
                TextView textView4 = this.Q;
                ImageView imageView2 = this.P;
                if (d) {
                    imageView2.setImageResource(R.drawable.vk_icon_donut_color_16);
                    imageView2.setImageTintList(null);
                    textView4.setText((articleDonut == null || (placeholder = articleDonut.c) == null || (linkButton = placeholder.d) == null) ? null : linkButton.b);
                    frameLayout.setVisibility(8);
                } else {
                    imageView2.setImageResource(R.drawable.vk_icon_flash_16);
                    imageView2.setImageTintList(ColorStateList.valueOf(-16777216));
                    textView4.setText(R.string.article_read);
                }
                boolean j = article.j();
                ViewGroup viewGroup = this.J;
                ViewGroup viewGroup2 = this.G;
                if (j) {
                    vKImageView.setVisibility(4);
                    viewGroup2.setVisibility(0);
                    viewGroup.setVisibility(8);
                    frameLayout.setVisibility(8);
                    textView2.setTextColor(this.itemView.getContext().getColor(R.color.vk_gray_400));
                    if (textView3 != null) {
                        textView3.setTextColor(this.itemView.getContext().getColor(R.color.vk_gray_400));
                    }
                } else {
                    viewGroup2.setVisibility(8);
                    viewGroup.setVisibility(0);
                    if (TextUtils.isEmpty(h9)) {
                        if (TextUtils.isEmpty(owner != null ? owner.e : null)) {
                            vKImageView.setPostprocessor(null);
                            vKImageView.setVisibility(4);
                            vKImageView.clear();
                            textView2.setTextColor(this.itemView.getContext().getColor(R.color.vk_gray_400));
                            if (textView3 != null) {
                                textView3.setTextColor(this.itemView.getContext().getColor(R.color.vk_gray_400));
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(h9)) {
                        sr10 sr10Var = dy2.a;
                        if ((sr10Var != null ? sr10Var.c() : true) && !this.t) {
                            vKImageView.setPostprocessor(null);
                            vKImageView.setVisibility(0);
                            vKImageView.load(h9);
                            textView2.setTextColor(-1);
                            if (textView3 != null) {
                                textView3.setTextColor(-1);
                            }
                        }
                    }
                    vKImageView.setPostprocessor(Y);
                    vKImageView.setVisibility(0);
                    vKImageView.load(owner != null ? owner.f(200) : null);
                    textView2.setTextColor(-1);
                    if (textView3 != null) {
                        textView3.setTextColor(-1);
                    }
                }
            }
            Y6();
        }
        solidColorView.setColor(X);
        this.itemView.setEnabled(!article.g() || d);
        i = article.i();
        linearLayout = this.F;
        linearLayout2 = this.K;
        vKImageView = this.D;
        if (i) {
        }
        vKImageView.setVisibility(4);
        linearLayout2.setVisibility(0);
        linearLayout.setVisibility(8);
        Q8 = article.Q8();
        TextView textView5 = this.M;
        ImageView imageView3 = this.L;
        if (!Q8) {
        }
        Y6();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X6() {
        s3q0 s3q0Var;
        e6o e6oVar = this.U;
        if (e6oVar != null) {
            this.itemView.setOnClickListener(e6oVar);
        } else {
            this.itemView.setOnClickListener(this);
        }
        e6o e6oVar2 = this.V;
        ImageView imageView = this.N;
        if (e6oVar2 != null) {
            if (imageView != null) {
                imageView.setOnClickListener(e6oVar2);
                s3q0Var = s3q0.a;
            } else {
                s3q0Var = null;
            }
        }
        if (imageView != null) {
            imageView.setOnClickListener(this.S);
            s3q0 s3q0Var2 = s3q0.a;
        }
        e6o e6oVar3 = this.W;
        View view = this.O;
        if (e6oVar3 != null) {
            view.setOnClickListener(e6oVar3);
        } else {
            view.setOnClickListener(this.T);
        }
    }

    public final void Y6() {
        boolean D = hd60.a().D();
        ImageView imageView = this.N;
        if (!D || (q6() instanceof FaveEntry) || (t6() instanceof FaveEntry)) {
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
            return;
        }
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ArticleAttachment articleAttachment = (ArticleAttachment) this.C;
        if (articleAttachment == null) {
            return;
        }
        boolean z = articleAttachment.f.n;
        if (imageView != null) {
            imageView.setActivated(z);
        }
        if (imageView != null) {
            imageView.setContentDescription(z ? v6(R.string.fave_accessibility_remove_from_favorite) : v6(R.string.fave_accessibility_add_to_favorite));
        }
    }

    @Override // xsna.blc0
    public final void j1(View.OnClickListener onClickListener) {
        this.T = onClickListener;
        s6o s6oVar = this.q;
        View view = this.O;
        if (s6oVar == null) {
            view.setOnClickListener(onClickListener);
            return;
        }
        e6o a = s6oVar.a(onClickListener, s6oVar.e);
        this.W = a;
        view.setOnClickListener(a);
    }

    @Override // xsna.m56, android.view.View.OnClickListener
    public void onClick(View view) {
        if (jjc.b()) {
            return;
        }
        W6(view);
    }

    @Override // xsna.blc0
    public final void p5() {
    }

    @Override // xsna.blc0
    public void Z1(x64 x64Var) {
    }
}
