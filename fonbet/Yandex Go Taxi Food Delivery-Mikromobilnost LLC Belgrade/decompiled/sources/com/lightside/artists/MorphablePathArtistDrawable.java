package com.lightside.artists;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Path;
import android.graphics.RectF;
import com.yandex.div.state.db.StateEntry;
import defpackage.ft20;
import defpackage.h730;
import defpackage.i730;
import defpackage.k730;
import defpackage.tls;
import defpackage.uc20;
import defpackage.ur90;
import defpackage.xr90;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\u000e\u001a\u00020\f*\u00020\u00072\u001c\u0010\r\u001a\u0018\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000b\u0012\u0004\u0012\u00020\f0\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJC\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\u0004\u0018\u0001`\u000b2\u0010\u0010\u0011\u001a\f\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010 Rp\u0010$\u001a(\u0012\f\u0012\n \"*\u0004\u0018\u00010\n0\n \"*\u0014\u0012\u000e\b\u0001\u0012\n \"*\u0004\u0018\u00010\n0\n\u0018\u00010\t0\t2,\u0010#\u001a(\u0012\f\u0012\n \"*\u0004\u0018\u00010\n0\n \"*\u0014\u0012\u000e\b\u0001\u0012\n \"*\u0004\u0018\u00010\n0\n\u0018\u00010\t0\t8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010)¨\u0006-"}, d2 = {"Lcom/lightside/artists/MorphablePathArtistDrawable;", "Lcom/lightside/artists/ArtistDrawable;", "Lh730;", "", StateEntry.COLUMN_PATH, "<init>", "(Ljava/lang/String;)V", "Landroid/animation/ValueAnimator;", "Lkotlin/Function1;", "", "Lur90;", "Lcom/lightside/artists/PathData;", "Lzy11;", "listener", "setPathDataListener", "(Landroid/animation/ValueAnimator;Ltls;)V", "from", "to", "", "duration", "Landroid/animation/Animator;", "animatePath", "([Lur90;[Lur90;J)Landroid/animation/Animator;", "", "left", "top", "right", "bottom", "overrideViewPort", "(FFFF)V", "", "getIntrinsicWidth", "()I", "getIntrinsicHeight", "kotlin.jvm.PlatformType", "value", "pathData", "[Lur90;", "setPathData", "([Lur90;)V", "intrinsicWidth", CA20Status.STATUS_USER_I, "intrinsicHeight", "Companion", "k730", "graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MorphablePathArtistDrawable extends ArtistDrawable<h730> {
    public static final k730 Companion = new k730();
    public static final long DEFAULT_DURATION = 300;
    private int intrinsicHeight;
    private int intrinsicWidth;
    private ur90[] pathData;

    public MorphablePathArtistDrawable(String str) {
        super(new h730());
        this.pathData = xr90.c(str);
        this.intrinsicWidth = -1;
        this.intrinsicHeight = -1;
        h730 artist = getArtist();
        ur90[] ur90VarArr = this.pathData;
        Path path = artist.a;
        path.reset();
        ur90.b(ur90VarArr, path);
        artist.a();
        artist.n = true;
    }

    public static /* synthetic */ Animator animatePath$default(MorphablePathArtistDrawable morphablePathArtistDrawable, ur90[] ur90VarArr, ur90[] ur90VarArr2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            ur90VarArr = null;
        }
        if ((i & 4) != 0) {
            j = 300;
        }
        return morphablePathArtistDrawable.animatePath(ur90VarArr, ur90VarArr2, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 animatePath$lambda$1$lambda$0(MorphablePathArtistDrawable morphablePathArtistDrawable, ur90[] ur90VarArr) {
        morphablePathArtistDrawable.setPathData(ur90VarArr);
        morphablePathArtistDrawable.invalidateSelf();
        return zy11.a;
    }

    private final void setPathData(ur90[] ur90VarArr) {
        this.pathData = ur90VarArr;
        h730 artist = getArtist();
        Path path = artist.a;
        path.reset();
        ur90.b(ur90VarArr, path);
        artist.a();
        artist.n = true;
    }

    private final void setPathDataListener(ValueAnimator valueAnimator, tls tlsVar) {
        valueAnimator.addUpdateListener(new i730(tlsVar, valueAnimator, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setPathDataListener$lambda$2(tls tlsVar, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        tlsVar.invoke((ur90[]) valueAnimator.getAnimatedValue());
    }

    public final Animator animatePath(ur90[] from, ur90[] to, long duration) {
        if (from == null) {
            from = this.pathData;
        }
        if (!xr90.a(from, to)) {
            setPathData(to);
            invalidateSelf();
            return null;
        }
        ValueAnimator ofObject = ValueAnimator.ofObject(new PathDataEvaluator(), from, to);
        ofObject.setDuration(duration);
        setPathDataListener(ofObject, new ft20(8, this));
        ofObject.start();
        return ofObject;
    }

    @Override // com.lightside.artists.ArtistDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.intrinsicHeight;
    }

    @Override // com.lightside.artists.ArtistDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.intrinsicWidth;
    }

    public final void overrideViewPort(float left, float top, float right, float bottom) {
        h730 artist = getArtist();
        artist.getClass();
        artist.j = new RectF(left, top, right, bottom);
        float f = right - left;
        float f2 = uc20.a.density;
        this.intrinsicWidth = (int) (f * f2);
        this.intrinsicHeight = (int) ((bottom - top) * f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MorphablePathArtistDrawable() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ MorphablePathArtistDrawable(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
