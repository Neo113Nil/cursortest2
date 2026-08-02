package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.net.Uri;
import android.util.SizeF;
import android.view.View;
import com.facebook.soloader.MinElf;
import com.vk.dto.common.Good;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.dto.stories.model.clickable.ClickableApp;
import com.vk.dto.stories.model.clickable.ClickableHashtag;
import com.vk.dto.stories.model.clickable.ClickableMarketItem;
import com.vk.dto.stories.model.clickable.ClickableMusic;
import com.vk.dto.stories.model.clickable.ClickableMusicPlaylist;
import com.vk.dto.stories.model.clickable.ClickableOwner;
import com.vk.dto.stories.model.clickable.ClickablePhoto;
import com.vk.dto.stories.model.clickable.ClickablePhotoAlbum;
import com.vk.dto.stories.model.clickable.ClickablePoll;
import com.vk.dto.stories.model.clickable.ClickableQuestion;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.ecomm.moderation.api.restrictions.ModerationCheckAdultResult;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vkontakte.android.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import xsna.o0r0;

/* compiled from: ClickableStickerDelegateImpl.kt */
/* loaded from: classes6.dex */
public final class qkc implements xjc, w8i {
    public final List<ClickableStickers> b;
    public final RectF c;
    public final a d;
    public final StoryViewerRouter e;
    public com.vk.movika.tools.controls.seekbar.v f;
    public final bpn0 g;
    public final bpn0 h;
    public final bpn0 i;
    public final bpn0 j;
    public final bpn0 k;
    public final bpn0 l;
    public final Path m;
    public final Paint n;
    public final HashMap<ClickableSticker, PointF[]> o;

    /* compiled from: ClickableStickerDelegateImpl.kt */
    public static final class a {
        public final izs<ClickableQuestion, Boolean> a;
        public final izs<ClickablePoll, Boolean> b;
        public final izs<ClickableMusic, Boolean> c;
        public final izs<ClickableMusicPlaylist, Boolean> d;
        public final izs<ClickableHashtag, Boolean> e;
        public final izs<ClickablePhoto, Boolean> f;
        public final izs<ClickablePhotoAlbum, Boolean> g;
        public final gzs<Boolean> h;

        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super ClickableQuestion, Boolean> izsVar, izs<? super ClickablePoll, Boolean> izsVar2, izs<? super ClickableMusic, Boolean> izsVar3, izs<? super ClickableMusicPlaylist, Boolean> izsVar4, izs<? super ClickableHashtag, Boolean> izsVar5, izs<? super ClickablePhoto, Boolean> izsVar6, izs<? super ClickablePhotoAlbum, Boolean> izsVar7, gzs<Boolean> gzsVar) {
            this.a = izsVar;
            this.b = izsVar2;
            this.c = izsVar3;
            this.d = izsVar4;
            this.e = izsVar5;
            this.f = izsVar6;
            this.g = izsVar7;
            this.h = gzsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h);
        }

        public final int hashCode() {
            int c = dq.c(this.a.hashCode() * 31, 31, this.b);
            izs<ClickableMusic, Boolean> izsVar = this.c;
            int hashCode = (c + (izsVar == null ? 0 : izsVar.hashCode())) * 31;
            izs<ClickableMusicPlaylist, Boolean> izsVar2 = this.d;
            int hashCode2 = (hashCode + (izsVar2 == null ? 0 : izsVar2.hashCode())) * 31;
            izs<ClickableHashtag, Boolean> izsVar3 = this.e;
            int hashCode3 = (hashCode2 + (izsVar3 == null ? 0 : izsVar3.hashCode())) * 31;
            izs<ClickablePhoto, Boolean> izsVar4 = this.f;
            int hashCode4 = (hashCode3 + (izsVar4 == null ? 0 : izsVar4.hashCode())) * 31;
            izs<ClickablePhotoAlbum, Boolean> izsVar5 = this.g;
            int hashCode5 = (hashCode4 + (izsVar5 == null ? 0 : izsVar5.hashCode())) * 31;
            gzs<Boolean> gzsVar = this.h;
            return hashCode5 + (gzsVar != null ? gzsVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClickListeners(onQuestionClicked=");
            sb.append(this.a);
            sb.append(", onPollClicked=");
            sb.append(this.b);
            sb.append(", onMusicClicked=");
            sb.append(this.c);
            sb.append(", onMusicPlaylistClicked=");
            sb.append(this.d);
            sb.append(", onHashtagClicked=");
            sb.append(this.e);
            sb.append(", onPhotoClicked=");
            sb.append(this.f);
            sb.append(", onPhotoAlbumClicked=");
            sb.append(this.g);
            sb.append(", onTooltipClicked=");
            return uf3.d(sb, this.h, ')');
        }
    }

    /* compiled from: ClickableStickerDelegateImpl.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ModerationCheckAdultResult.values().length];
            try {
                iArr[ModerationCheckAdultResult.CONFIRM_ADULT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ModerationCheckAdultResult.ONLY_FOR_ADULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public qkc() {
        throw null;
    }

    public qkc(List list, RectF rectF, a aVar, StoryViewerRouter storyViewerRouter) {
        this.b = list;
        this.c = rectF;
        this.d = aVar;
        this.e = storyViewerRouter;
        this.f = null;
        this.g = new bpn0(new j1(this, 20));
        this.h = new bpn0(new s1(this, 17));
        this.i = new bpn0(new rj1(this, 16));
        this.j = new bpn0(new vf0(this, 17));
        this.k = new bpn0(new b3(this, 15));
        this.l = new bpn0(new na(this, 17));
        this.m = new Path();
        Paint paint = new Paint();
        paint.setColor(-16711681);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(iah0.a(2));
        this.n = paint;
        this.o = new HashMap<>();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f((ClickableStickers) it.next(), this.c, true);
        }
    }

    public static void l(y5p0 y5p0Var, ymm0 ymm0Var, View.OnClickListener onClickListener) {
        Activity N0 = y5p0Var.N0();
        if (y5p0Var instanceof uov) {
            ((uov) y5p0Var).Nf(ymm0Var, onClickListener);
        } else if (N0 != null) {
            y5p0Var.s0();
            zmm0.a(N0, ymm0Var, new wh4(2, y5p0Var, onClickListener), new xm1(y5p0Var, 17));
        }
    }

    @Override // xsna.xjc
    public final void a(ClickablePoll clickablePoll) {
        com.vk.movika.tools.controls.seekbar.v vVar;
        if (clickablePoll == null || (vVar = this.f) == null) {
            return;
        }
        vVar.invoke(StoryViewAction.CLICK_ON_CLICKABLE_STICKER, new d7(this, clickablePoll));
    }

    @Override // xsna.xjc
    public final boolean b(y5p0 y5p0Var, ClickableApp clickableApp) {
        ApiApplication apiApplication;
        String str;
        Activity N0;
        s3q0 s3q0Var;
        if (!qxi.a().c(WebStickerType.APP) || (apiApplication = clickableApp.f) == null || (str = apiApplication.G) == null || (N0 = y5p0Var.N0()) == null) {
            return false;
        }
        b6m.a().l(N0, apiApplication, str, Uri.parse(str).toString(), new sa0(this, 18));
        uov uovVar = y5p0Var instanceof uov ? (uov) y5p0Var : null;
        if (uovVar != null) {
            StoryEntry currentStory = uovVar.getCurrentStory();
            if (clickableApp.g && currentStory != null) {
                Context ctx = uovVar.getCtx();
                ver0.c(ctx, ((rul0) this.g.getValue()).g(currentStory, clickableApp.b).subscribe(new xn(new aa9(currentStory, clickableApp, this, ctx), 10), new i22(new md(15), 8)));
            }
            s3q0Var = s3q0.a;
        } else {
            s3q0Var = null;
        }
        if (s3q0Var == null) {
            return false;
        }
        com.vk.movika.tools.controls.seekbar.v vVar = this.f;
        if (vVar == null) {
            return true;
        }
        vVar.invoke(StoryViewAction.CLICK_TO_APP, null);
        return true;
    }

    @Override // xsna.xjc
    public final void c() {
        this.o.clear();
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            f((ClickableStickers) it.next(), this.c, false);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // xsna.xjc
    public final boolean d(xsna.y5p0 r33, com.vk.dto.stories.model.clickable.ClickableStickers r34, float r35, float r36, java.lang.Long r37) {
        /*
            Method dump skipped, instructions count: 1481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.qkc.d(xsna.y5p0, com.vk.dto.stories.model.clickable.ClickableStickers, float, float, java.lang.Long):boolean");
    }

    @Override // xsna.xjc
    public final void e(Canvas canvas, ClickableStickers clickableStickers) {
        if (clickableStickers != null) {
            HashMap<ClickableSticker, PointF[]> hashMap = this.o;
            if (hashMap.size() == 0) {
                return;
            }
            Iterator<T> it = clickableStickers.d.iterator();
            while (it.hasNext()) {
                PointF[] pointFArr = hashMap.get((ClickableSticker) it.next());
                if (pointFArr != null) {
                    Path path = this.m;
                    path.reset();
                    int length = pointFArr.length;
                    for (int i = 0; i < length; i++) {
                        PointF pointF = pointFArr[i];
                        float f = pointF.x;
                        float f2 = pointF.y;
                        if (i == 0) {
                            path.moveTo(f, f2);
                        } else {
                            path.lineTo(f, f2);
                        }
                    }
                    path.close();
                    Paint paint = this.n;
                    canvas.drawPath(path, paint);
                    PointF a2 = bn10.a(pointFArr);
                    if (a2 != null) {
                        canvas.drawCircle(a2.x, a2.y, iah0.a(3), paint);
                    }
                }
            }
        }
    }

    public final void f(ClickableStickers clickableStickers, RectF rectF, boolean z) {
        Matrix matrix = new Matrix();
        xx1.g(matrix, new SizeF(rectF.width(), rectF.height()), rectF.top, new SizeF(clickableStickers.b, clickableStickers.c), z);
        for (ClickableSticker clickableSticker : clickableStickers.d) {
            int size = clickableSticker.c.size();
            float[] fArr = new float[size * 2];
            for (int i = 0; i < size; i++) {
                int i2 = i * 2;
                fArr[i2] = r10.get(i).b;
                fArr[i2 + 1] = r10.get(i).c;
            }
            matrix.mapPoints(fArr);
            PointF[] pointFArr = new PointF[size];
            for (int i3 = 0; i3 < size; i3++) {
                int i4 = i3 * 2;
                pointFArr[i3] = new PointF(fArr[i4], fArr[i4 + 1]);
            }
            this.o.put(clickableSticker, pointFArr);
        }
    }

    public final Float g(ClickableSticker clickableSticker, Integer num) {
        PointF[] pointFArr = this.o.get(clickableSticker);
        if (num == null || pointFArr == null) {
            return null;
        }
        int i = 1;
        if (num.intValue() == 48) {
            if (pointFArr.length == 0) {
                throw new NoSuchElementException();
            }
            float f = pointFArr[0].y;
            int length = pointFArr.length - 1;
            if (1 <= length) {
                while (true) {
                    f = Math.min(f, pointFArr[i].y);
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            return Float.valueOf((this.c.top * 0.5f) + f);
        }
        if (pointFArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f2 = pointFArr[0].y;
        int length2 = pointFArr.length - 1;
        if (1 <= length2) {
            while (true) {
                f2 = Math.max(f2, pointFArr[i].y);
                if (i == length2) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(f2);
    }

    public final Integer h(y5p0 y5p0Var, float f, float f2) {
        Activity N0 = y5p0Var.N0();
        if (N0 == null) {
            return null;
        }
        float height = this.c.height() - f;
        HashSet hashSet = iah0.a;
        return f2 - ((float) fnj.a(N0)) > height ? 48 : 80;
    }

    public final void i(Context context, ClickableMarketItem clickableMarketItem) {
        Good good = clickableMarketItem.j;
        if (good != null) {
            ((sz00) this.l.getValue()).e(context, new rz00(good, CommonMarketStat$TypeRefSource.STORIES, null, null, null, null, null, null, null, null, null, clickableMarketItem.l, null, null, null, null, 63484));
            return;
        }
        String str = clickableMarketItem.g;
        if (str == null) {
            return;
        }
        g2v.c().k().b(context, str);
    }

    public final void j(Context context, ModerationCheckAdultResult moderationCheckAdultResult, gzs gzsVar) {
        int i = b.$EnumSwitchMapping$0[moderationCheckAdultResult.ordinal()];
        bpn0 bpn0Var = this.k;
        if (i == 1) {
            k530.b((k530) bpn0Var.getValue(), context, false, gzsVar, new wx0(this, context), 2);
        } else if (i != 2) {
            rdi.E();
        } else {
            ((k530) bpn0Var.getValue()).a(context, false);
        }
    }

    public final boolean k(y5p0 y5p0Var, float f, float f2, final ClickableOwner clickableOwner, final UserId userId) {
        if (!qxi.a().c(WebStickerType.OWNER)) {
            return false;
        }
        l(y5p0Var, new ymm0(y8g0.e(R.string.story_view_go_to_author), null, f, f2, null, 0, false, true, false, null, false, false), new View.OnClickListener() { // from class: xsna.fkc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserId userId2;
                ClickableOwner clickableOwner2 = ClickableOwner.this;
                if (clickableOwner2 != null) {
                    this.m(clickableOwner2);
                }
                o0r0 e = xwk.e();
                Context context = view.getContext();
                if (clickableOwner2 == null || (userId2 = clickableOwner2.e) == null) {
                    userId2 = userId;
                }
                e.m(context, userId2, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
            }
        });
        return true;
    }

    public final void m(ClickableSticker clickableSticker) {
        com.vk.movika.tools.controls.seekbar.v vVar = this.f;
        if (vVar != null) {
            vVar.invoke(StoryViewAction.CLICK_TO_TOOLTIP, new kf1(this, clickableSticker));
        }
    }
}
