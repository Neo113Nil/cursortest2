package com.yandex.alicekit.core.artist;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import com.yandex.div.state.db.StateEntry;
import defpackage.g730;
import defpackage.i730;
import defpackage.j730;
import defpackage.kjs0;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.tls;
import defpackage.vr90;
import defpackage.w511;
import defpackage.yr90;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\b\u0016\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\u000e\u001a\u00020\f*\u00020\u00072\u001c\u0010\r\u001a\u0018\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000b\u0012\u0004\u0012\u00020\f0\bH\u0012¢\u0006\u0004\b\u000e\u0010\u000fJE\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\u0004\u0018\u0001`\u000b2\u0010\u0010\u0011\u001a\f\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010 Rp\u0010$\u001a(\u0012\f\u0012\n \"*\u0004\u0018\u00010\n0\n \"*\u0014\u0012\u000e\b\u0001\u0012\n \"*\u0004\u0018\u00010\n0\n\u0018\u00010\t0\t2,\u0010#\u001a(\u0012\f\u0012\n \"*\u0004\u0018\u00010\n0\n \"*\u0014\u0012\u000e\b\u0001\u0012\n \"*\u0004\u0018\u00010\n0\n\u0018\u00010\t0\t8\u0012@RX\u0092\u000e¢\u0006\f\n\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u001e8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u001e8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b*\u0010)¨\u0006-"}, d2 = {"Lcom/yandex/alicekit/core/artist/MorphablePathArtistDrawable;", "Lcom/yandex/alicekit/core/artist/ArtistDrawable;", "Lg730;", "", StateEntry.COLUMN_PATH, "<init>", "(Ljava/lang/String;)V", "Landroid/animation/ValueAnimator;", "Lkotlin/Function1;", "", "Lvr90;", "Lcom/yandex/alicekit/core/artist/PathData;", "Lzy11;", "listener", "setPathDataListener", "(Landroid/animation/ValueAnimator;Ltls;)V", "from", "to", "", "duration", "Landroid/animation/Animator;", "animatePath", "([Lvr90;[Lvr90;J)Landroid/animation/Animator;", "", "left", "top", "right", "bottom", "overrideViewPort", "(FFFF)V", "", "getIntrinsicWidth", "()I", "getIntrinsicHeight", "kotlin.jvm.PlatformType", "value", "pathData", "[Lvr90;", "setPathData", "([Lvr90;)V", "intrinsicWidth", CA20Status.STATUS_USER_I, "intrinsicHeight", "Companion", "j730", "com.yandex.alicekit.core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public class MorphablePathArtistDrawable extends ArtistDrawable<g730> {
    public static final j730 Companion = new j730();
    public static final long DEFAULT_DURATION = 300;
    private int intrinsicHeight;
    private int intrinsicWidth;
    private vr90[] pathData;

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3 A[Catch: NumberFormatException -> 0x00b7, LOOP:3: B:25:0x0073->B:35:0x00a3, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00b7, blocks: (B:22:0x005e, B:25:0x0073, B:27:0x0079, B:31:0x0085, B:35:0x00a3, B:39:0x00a9, B:44:0x00be, B:56:0x00c1), top: B:21:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9 A[Catch: NumberFormatException -> 0x00b7, TryCatch #0 {NumberFormatException -> 0x00b7, blocks: (B:22:0x005e, B:25:0x0073, B:27:0x0079, B:31:0x0085, B:35:0x00a3, B:39:0x00a9, B:44:0x00be, B:56:0x00c1), top: B:21:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00be A[Catch: NumberFormatException -> 0x00b7, TryCatch #0 {NumberFormatException -> 0x00b7, blocks: (B:22:0x005e, B:25:0x0073, B:27:0x0079, B:31:0x0085, B:35:0x00a3, B:39:0x00a9, B:44:0x00be, B:56:0x00c1), top: B:21:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MorphablePathArtistDrawable(String str) {
        super(new g730());
        String trim;
        float[] fArr;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        int i3 = 1;
        while (i3 < str.length()) {
            while (i3 < str.length()) {
                char charAt = str.charAt(i3);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i3++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = str.substring(i2, i3).trim();
                    if (trim.length() > 0) {
                        if (trim.charAt(i) == 'z' || trim.charAt(i) == 'Z') {
                            fArr = new float[i];
                        } else {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i4 = i;
                                int i5 = 1;
                                while (i5 < length) {
                                    int i6 = i;
                                    int i7 = i6;
                                    int i8 = i7;
                                    int i9 = i8;
                                    for (int i10 = i5; i10 < trim.length(); i10++) {
                                        char charAt2 = trim.charAt(i10);
                                        if (charAt2 != ' ') {
                                            if (charAt2 != 'E' && charAt2 != 'e') {
                                                switch (charAt2) {
                                                    case ',':
                                                        break;
                                                    case '-':
                                                        if (i10 != i5 && i6 == 0) {
                                                            i6 = 0;
                                                            i8 = 1;
                                                            i9 = 1;
                                                            break;
                                                        }
                                                        i6 = 0;
                                                        break;
                                                    case '.':
                                                        if (i7 == 0) {
                                                            i6 = 0;
                                                            i7 = 1;
                                                            break;
                                                        }
                                                        i6 = 0;
                                                        i8 = 1;
                                                        i9 = 1;
                                                        break;
                                                    default:
                                                        i6 = 0;
                                                        break;
                                                }
                                            } else {
                                                i6 = 1;
                                            }
                                            if (i8 == 0) {
                                                if (i5 < i10) {
                                                    fArr2[i4] = Float.parseFloat(trim.substring(i5, i10));
                                                    i4++;
                                                }
                                                i5 = i9 == 0 ? i10 : i10 + 1;
                                                i = 0;
                                            }
                                        }
                                        i6 = 0;
                                        i8 = 1;
                                        if (i8 == 0) {
                                        }
                                    }
                                    if (i5 < i10) {
                                    }
                                    if (i9 == 0) {
                                    }
                                    i = 0;
                                }
                                fArr = yr90.b(fArr2, i4);
                                i = 0;
                            } catch (NumberFormatException e) {
                                ny61.n(oyr.p("error in parsing \"", trim, "\""), e);
                                throw null;
                            }
                        }
                        char charAt3 = trim.charAt(i);
                        vr90 vr90Var = new vr90();
                        vr90Var.a = charAt3;
                        vr90Var.b = fArr;
                        arrayList.add(vr90Var);
                    }
                    i2 = i3;
                    i3++;
                    i = 0;
                }
                i3++;
            }
            trim = str.substring(i2, i3).trim();
            if (trim.length() > 0) {
            }
            i2 = i3;
            i3++;
            i = 0;
        }
        if (i3 - i2 == 1 && i2 < str.length()) {
            char charAt4 = str.charAt(i2);
            vr90 vr90Var2 = new vr90();
            vr90Var2.a = charAt4;
            vr90Var2.b = new float[0];
            arrayList.add(vr90Var2);
        }
        this.pathData = (vr90[]) arrayList.toArray(new vr90[arrayList.size()]);
        this.intrinsicWidth = -1;
        this.intrinsicHeight = -1;
        getArtist().a(this.pathData);
    }

    public static /* synthetic */ Animator animatePath$default(MorphablePathArtistDrawable morphablePathArtistDrawable, vr90[] vr90VarArr, vr90[] vr90VarArr2, long j, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: animatePath");
            return null;
        }
        if ((i & 1) != 0) {
            vr90VarArr = null;
        }
        if ((i & 4) != 0) {
            j = 300;
        }
        return morphablePathArtistDrawable.animatePath(vr90VarArr, vr90VarArr2, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPathData(vr90[] vr90VarArr) {
        this.pathData = vr90VarArr;
        getArtist().a(vr90VarArr);
    }

    private void setPathDataListener(ValueAnimator valueAnimator, tls tlsVar) {
        valueAnimator.addUpdateListener(new i730(tlsVar, valueAnimator, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setPathDataListener$lambda$1(tls tlsVar, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        tlsVar.invoke((vr90[]) valueAnimator.getAnimatedValue());
    }

    public Animator animatePath(vr90[] from, vr90[] to, long duration) {
        if (from == null) {
            from = this.pathData;
        }
        if (!yr90.a(from, to)) {
            setPathData(to);
            invalidateSelf();
            return null;
        }
        ValueAnimator ofObject = ValueAnimator.ofObject(new PathDataEvaluator(), from, to);
        ofObject.setDuration(duration);
        setPathDataListener(ofObject, new tls() { // from class: com.yandex.alicekit.core.artist.MorphablePathArtistDrawable$animatePath$1$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                MorphablePathArtistDrawable.this.setPathData((vr90[]) obj);
                MorphablePathArtistDrawable.this.invalidateSelf();
                return zy11.a;
            }
        });
        ofObject.start();
        return ofObject;
    }

    @Override // com.yandex.alicekit.core.artist.ArtistDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.intrinsicHeight;
    }

    @Override // com.yandex.alicekit.core.artist.ArtistDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.intrinsicWidth;
    }

    public void overrideViewPort(float left, float top, float right, float bottom) {
        g730 artist = getArtist();
        artist.getClass();
        artist.j = new RectF(left, top, right, bottom);
        this.intrinsicWidth = kjs0.a(right - left);
        this.intrinsicHeight = kjs0.a(bottom - top);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MorphablePathArtistDrawable() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ MorphablePathArtistDrawable(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
