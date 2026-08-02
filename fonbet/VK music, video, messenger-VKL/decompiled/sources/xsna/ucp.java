package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannedString;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.unity3d.services.UnityAdsConstants;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: Emoji.kt */
/* loaded from: classes.dex */
public final class ucp {
    public static a b;
    public static final Paint e;
    public static int f;
    public static int g;
    public static int h;
    public static int i;
    public static int j;
    public static float k;
    public static float l;
    public static File[] m;
    public static final Rect n;
    public static volatile boolean o;

    @SuppressLint({"StaticFieldLeak"})
    public static Context p;
    public static ExecutorService q;
    public static b r;
    public static final AtomicBoolean[] s;
    public static final WeakReference<Bitmap>[] t;
    public static volatile m900<gep, wik0<cdp>> u;
    public static final m900<e, Bitmap> v;
    public static final bpn0 w;
    public static final ucp a = new ucp();
    public static final io.reactivex.rxjava3.subjects.f<s3q0> c = new io.reactivex.rxjava3.subjects.f<>();
    public static final io.reactivex.rxjava3.subjects.f<Integer> d = new io.reactivex.rxjava3.subjects.f<>();

    /* compiled from: Emoji.kt */
    public interface a {
        void a(IllegalStateException illegalStateException);
    }

    /* compiled from: Emoji.kt */
    public interface b {
        SharedPreferences provide();
    }

    /* compiled from: Emoji.kt */
    /* loaded from: classes18.dex */
    public static final class d extends Drawable.ConstantState {
        public final e a;
        public final int b;
        public final int c;
        public final int d;

        public d(e eVar, int i, int i2, int i3) {
            this.a = eVar;
            this.b = i;
            this.c = i2;
            this.d = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && this.b == dVar.b && this.c == dVar.c && this.d == dVar.d;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new c(this);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SpriteEmojiDrawableState(location=");
            sb.append(this.a);
            sb.append(", size=");
            sb.append(this.b);
            sb.append(", paddingHorizontal=");
            sb.append(this.c);
            sb.append(", paddingVertical=");
            return vu5.b(sb, this.d, ')');
        }
    }

    /* compiled from: Emoji.kt */
    /* loaded from: classes18.dex */
    public static final class e {
        public final int a;
        public final int b;
        public final int c;

        public e(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && this.b == eVar.b && this.c == eVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SpriteLocation(spriteIndex=");
            sb.append(this.a);
            sb.append(", x=");
            sb.append(this.b);
            sb.append(", y=");
            return vu5.b(sb, this.c, ')');
        }
    }

    static {
        Paint paint = new Paint();
        paint.setColor(0);
        e = paint;
        n = new Rect();
        AtomicBoolean[] atomicBooleanArr = new AtomicBoolean[25];
        for (int i2 = 0; i2 < 25; i2++) {
            atomicBooleanArr[i2] = new AtomicBoolean();
        }
        s = atomicBooleanArr;
        WeakReference<Bitmap>[] weakReferenceArr = new WeakReference[25];
        for (int i3 = 0; i3 < 25; i3++) {
            weakReferenceArr[i3] = new WeakReference<>(null);
        }
        t = weakReferenceArr;
        u = new m900<>(100);
        v = new m900<>(400);
        w = new bpn0(new xh6(2));
    }

    public static io.reactivex.rxjava3.internal.operators.observable.m1 a() {
        return c.y(50L, TimeUnit.MILLISECONDS).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    public static gep b(String str) {
        if (drm0.N(str)) {
            return null;
        }
        udp d2 = d();
        int length = str.length();
        hep hepVar = d2.a;
        if (hepVar != null) {
            return hepVar.a(0, length, str);
        }
        return null;
    }

    public static cdp c(gep gepVar, int i2) {
        wik0<cdp> wik0Var = u.get(gepVar);
        if (wik0Var == null) {
            wik0Var = new wik0<>(0);
            u.put(gepVar, wik0Var);
        }
        cdp g2 = wik0Var.g(i2);
        if (g2 != null) {
            return g2;
        }
        c cVar = new c(gepVar, i2, f, g);
        wik0Var.h(i2, cVar);
        return cVar;
    }

    public static udp d() {
        return (udp) w.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(View view) {
        wdp[] wdpVarArr;
        if (view == 0 || view.getVisibility() != 0) {
            return;
        }
        if (view instanceof lep) {
            ((lep) view).y();
            return;
        }
        int i2 = 0;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (i2 < childCount) {
                f(viewGroup.getChildAt(i2));
                i2++;
            }
            return;
        }
        if (view instanceof AppCompatEditText) {
            ((AppCompatEditText) view).requestLayout();
            return;
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            CharSequence text = textView.getText();
            if (text instanceof SpannedString) {
                SpannedString spannedString = (SpannedString) text;
                wdpVarArr = (wdp[]) spannedString.getSpans(0, spannedString.length(), wdp.class);
            } else if (text instanceof SpannableString) {
                SpannableString spannableString = (SpannableString) text;
                wdpVarArr = (wdp[]) spannableString.getSpans(0, spannableString.length(), wdp.class);
            } else {
                wdpVarArr = null;
            }
            if (wdpVarArr == null) {
                return;
            }
            while (i2 < wdpVarArr.length) {
                int i3 = i2 + 1;
                try {
                    Drawable a2 = wdpVarArr[i2].a();
                    if ((a2 instanceof c) && !((c) a2).b()) {
                        kno0.a(textView);
                        return;
                    }
                    i2 = i3;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new NoSuchElementException(e2.getMessage());
                }
            }
        }
    }

    public static Bitmap g(Context context, File[] fileArr, int i2, int i3) {
        if (fileArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir().getAbsolutePath() + "/emoji_sprites_assets/sprites_20260421165200/" + i2);
        sb.append('/');
        sb.append(String.format("emoji_sprite_%s.webp", Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1)));
        File file = new File(sb.toString());
        if (file.exists()) {
            return Bitmap.createBitmap(BitmapFactory.decodeFile(file.getAbsolutePath(), new BitmapFactory.Options()));
        }
        return null;
    }

    public static Spannable h(int i2, int i3, CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        Spannable newSpannable = charSequence instanceof Spannable ? (Spannable) charSequence : Spannable.Factory.getInstance().newSpannable(charSequence);
        gik0 gik0Var = new gik0(newSpannable);
        wbo wboVar = new wbo(i3, newSpannable);
        int i4 = 0;
        while (i4 < i2) {
            int c2 = gik0Var.c(i4);
            if (c2 == -1) {
                int a2 = gik0Var.a(i4);
                if (a2 == -1) {
                    a2 = i2;
                }
                hep hepVar = d().a;
                gep a3 = hepVar != null ? hepVar.a(i4, a2, newSpannable) : null;
                if (a3 != null) {
                    wboVar.invoke(a3, Integer.valueOf(i4));
                    i4 += a3.a();
                } else {
                    i4++;
                }
            } else {
                i4 = c2;
            }
        }
        return newSpannable;
    }

    public static CharSequence i(CharSequence charSequence) {
        return charSequence == null ? "" : h(charSequence.length(), h, charSequence);
    }

    public static CharSequence j(CharSequence charSequence, Float f2) {
        if (charSequence == null) {
            return "";
        }
        return h(charSequence.length(), f2 != null ? (int) f2.floatValue() : h, charSequence);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e4, code lost:
    
        if (r0 != 0) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Context context, ExecutorService executorService, b bVar, a aVar) {
        File[] fileArr;
        Context applicationContext = context.getApplicationContext();
        p = applicationContext;
        q = executorService;
        b = aVar;
        int integer = applicationContext.getResources().getInteger(R.integer.vk_emoji_size_in_sprite_if_downloaded);
        j = integer;
        Context context2 = p;
        ExecutorService executorService2 = null;
        if (context2 == null) {
            context2 = null;
        }
        File file = new File(context2.getFilesDir().getAbsolutePath() + "/emoji_sprites_assets/sprites_20260421165200/" + integer);
        if (!file.exists() || (fileArr = file.listFiles()) == null || fileArr.length != 25) {
            fileArr = null;
        }
        m = fileArr;
        if (fileArr != null) {
            o = true;
            L.e("UpdateEmojiSprites", "App is using downloaded emoji sprites");
        } else {
            o = j == 0;
            L.e("UpdateEmojiSprites", "App is not using downloaded emoji sprites");
        }
        Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        File[] fileArr2 = m;
        if (fileArr2 != null) {
            File file2 = fileArr2[0];
            int i2 = -1;
            if (file2.exists()) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                try {
                    FileInputStream fileInputStream = new FileInputStream(file2);
                    try {
                        BitmapFactory.decodeStream(fileInputStream, null, options);
                        fileInputStream.close();
                        int i3 = options.outWidth;
                        if (i3 == -1) {
                            a aVar2 = b;
                            if (aVar2 != null) {
                                aVar2.a(new IllegalStateException("Emoji failed to decode image width of " + file2));
                            }
                            ExecutorService executorService3 = q;
                            if (executorService3 == null) {
                                executorService3 = null;
                            }
                            executorService3.execute(new scp(0));
                        }
                        i2 = i3;
                    } finally {
                    }
                } catch (Exception unused) {
                }
            }
            float f2 = i2;
            ref$FloatRef.element = f2;
            int i4 = j;
            ref$IntRef.element = i4;
            if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            }
        }
        m = null;
        Context context3 = p;
        if (context3 == null) {
            context3 = null;
        }
        ref$FloatRef.element = m33.a(R.drawable.emoji_sprite_0, context3).getIntrinsicWidth();
        Context context4 = p;
        if (context4 == null) {
            context4 = null;
        }
        ref$IntRef.element = context4.getResources().getInteger(R.integer.vk_emoji_size_in_sprite);
        float f3 = ref$FloatRef.element / 13;
        k = f3;
        int i5 = ref$IntRef.element;
        if (i5 > 96) {
            i5 = 96;
        }
        float f4 = i5;
        if (f3 > f4) {
            f3 = f4;
        }
        k = f3;
        L.c("Emoji", new rcp(0, ref$FloatRef, ref$IntRef));
        if (!o || j <= 0) {
            L.e("Emoji", "using embedded sprites");
        } else {
            L.e("Emoji", "using downloaded sprites");
            float f5 = k;
            float f6 = j;
            if (f5 < f6) {
                f5 = f6;
            }
            k = f5;
        }
        float f7 = k;
        if (f7 < 48.0f) {
            f7 = 48.0f;
        }
        k = f7;
        if (f7 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            k = 48.0f;
        }
        float f8 = k;
        l = (f8 / 11) + f8;
        Context context5 = p;
        if (context5 == null) {
            context5 = null;
        }
        i = (int) context5.getResources().getDimension(R.dimen.vk_emoji_keyboard_item_draw);
        Context context6 = p;
        if (context6 == null) {
            context6 = null;
        }
        h = (int) k46.a(context6, 20.0f);
        Context context7 = p;
        if (context7 == null) {
            context7 = null;
        }
        f = (int) k46.a(context7, 1.5f);
        Context context8 = p;
        if (context8 == null) {
            context8 = null;
        }
        g = (int) k46.a(context8, 0.5f);
        r = bVar;
        synchronized (this) {
            ExecutorService executorService4 = q;
            if (executorService4 != null) {
                executorService2 = executorService4;
            }
            executorService2.execute(new tcp());
        }
    }

    /* compiled from: Emoji.kt */
    /* loaded from: classes18.dex */
    public static final class c extends cdp {
        public final d c;
        public boolean d;

        public c(d dVar) {
            super(dVar.b, dVar.c, dVar.d);
            this.c = dVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00e0 A[Catch: all -> 0x0101, TryCatch #0 {all -> 0x0101, blocks: (B:16:0x008e, B:18:0x0092, B:23:0x009c, B:27:0x00dc, B:29:0x00e0, B:32:0x00e5, B:35:0x00ea, B:37:0x00f5, B:39:0x0103, B:40:0x00cf, B:42:0x00d5, B:46:0x0111), top: B:15:0x008e }] */
        @Override // xsna.cdp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(Canvas canvas, Paint paint, Rect rect) {
            File[] listFiles;
            e eVar = this.c.a;
            m900<e, Bitmap> m900Var = ucp.v;
            Bitmap bitmap = m900Var.get(eVar);
            if (bitmap != null) {
                this.d = true;
                canvas.drawBitmap(bitmap, ucp.n, rect, paint);
                return;
            }
            final int i = eVar.a;
            WeakReference<Bitmap>[] weakReferenceArr = ucp.t;
            Bitmap bitmap2 = weakReferenceArr[i].get();
            if (bitmap2 != null && bitmap2.getWidth() >= an10.b(ucp.k * 13)) {
                this.d = true;
                int b = an10.b(eVar.b * ucp.l);
                int b2 = an10.b(eVar.c * ucp.l);
                int b3 = an10.b(ucp.k);
                Rect rect2 = ucp.n;
                rect2.left = 0;
                rect2.top = 0;
                rect2.right = b3;
                rect2.bottom = b3;
                Bitmap createBitmap = Bitmap.createBitmap(bitmap2, swe0.g(b, 0, bitmap2.getWidth() - b3), swe0.g(b2, 0, bitmap2.getHeight() - b3), b3, b3);
                m900Var.put(new e(eVar.a, eVar.b, eVar.c), createBitmap);
                canvas.drawBitmap(createBitmap, rect2, rect, paint);
                return;
            }
            this.d = false;
            ucp ucpVar = ucp.a;
            if (!ucp.o) {
                synchronized (ucpVar) {
                    try {
                        if (!ucp.o) {
                            Context context = ucp.p;
                            Context context2 = context == null ? null : context;
                            if (context == null) {
                                context = null;
                            }
                            File file = new File(context2.getFilesDir().getAbsolutePath() + "/emoji_sprites_assets/sprites_20260421165200/" + context.getResources().getInteger(R.integer.vk_emoji_size_in_sprite_if_downloaded));
                            if (file.exists() && (listFiles = file.listFiles()) != null && listFiles.length == 25) {
                                ucp.m = listFiles;
                                if (listFiles != null) {
                                    Context context3 = ucp.p;
                                    if (context3 == null) {
                                        context3 = null;
                                    }
                                    ExecutorService executorService = ucp.q;
                                    if (executorService == null) {
                                        executorService = null;
                                    }
                                    ucpVar.e(context3, executorService, ucp.r, ucp.b);
                                    int length = weakReferenceArr.length;
                                    for (int i2 = 0; i2 < length; i2++) {
                                        ucp.t[i2] = new WeakReference<>(null);
                                    }
                                    ucp.v.evictAll();
                                    ucp ucpVar2 = ucp.a;
                                    ucp.c.onNext(s3q0.a);
                                }
                            }
                            listFiles = null;
                            ucp.m = listFiles;
                            if (listFiles != null) {
                            }
                        }
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (ucp.s[i].compareAndSet(false, true)) {
                ExecutorService executorService2 = ucp.q;
                (executorService2 != null ? executorService2 : null).execute(new Runnable() { // from class: xsna.qcp
                    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
                    
                        if (r4 != null) goto L45;
                     */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        Bitmap bitmap3;
                        int i3;
                        int i4 = i;
                        WeakReference<Bitmap>[] weakReferenceArr2 = ucp.t;
                        ucp ucpVar3 = ucp.a;
                        try {
                            Context context4 = ucp.p;
                            if (context4 == null) {
                                context4 = null;
                            }
                            bitmap3 = ucp.g(context4, ucp.m, ucp.j, i4);
                        } catch (Throwable th2) {
                            L.i(th2);
                        }
                        Context context5 = ucp.p;
                        if (context5 == null) {
                            context5 = null;
                        }
                        Resources resources = context5.getResources();
                        switch (i4) {
                            case 0:
                                i3 = R.drawable.emoji_sprite_0;
                                break;
                            case 1:
                                i3 = R.drawable.emoji_sprite_1;
                                break;
                            case 2:
                                i3 = R.drawable.emoji_sprite_2;
                                break;
                            case 3:
                                i3 = R.drawable.emoji_sprite_3;
                                break;
                            case 4:
                                i3 = R.drawable.emoji_sprite_4;
                                break;
                            case 5:
                                i3 = R.drawable.emoji_sprite_5;
                                break;
                            case 6:
                                i3 = R.drawable.emoji_sprite_6;
                                break;
                            case 7:
                                i3 = R.drawable.emoji_sprite_7;
                                break;
                            case 8:
                                i3 = R.drawable.emoji_sprite_8;
                                break;
                            case 9:
                                i3 = R.drawable.emoji_sprite_9;
                                break;
                            case 10:
                                i3 = R.drawable.emoji_sprite_10;
                                break;
                            case 11:
                                i3 = R.drawable.emoji_sprite_11;
                                break;
                            case 12:
                                i3 = R.drawable.emoji_sprite_12;
                                break;
                            case 13:
                                i3 = R.drawable.emoji_sprite_13;
                                break;
                            case 14:
                                i3 = R.drawable.emoji_sprite_14;
                                break;
                            case 15:
                                i3 = R.drawable.emoji_sprite_15;
                                break;
                            case 16:
                                i3 = R.drawable.emoji_sprite_16;
                                break;
                            case 17:
                                i3 = R.drawable.emoji_sprite_17;
                                break;
                            case 18:
                                i3 = R.drawable.emoji_sprite_18;
                                break;
                            case 19:
                                i3 = R.drawable.emoji_sprite_19;
                                break;
                            case 20:
                                i3 = R.drawable.emoji_sprite_20;
                                break;
                            case 21:
                                i3 = R.drawable.emoji_sprite_21;
                                break;
                            case 22:
                                i3 = R.drawable.emoji_sprite_22;
                                break;
                            case 23:
                                i3 = R.drawable.emoji_sprite_23;
                                break;
                            default:
                                i3 = R.drawable.emoji_sprite_24;
                                break;
                        }
                        ThreadLocal<TypedValue> threadLocal = dbg0.a;
                        Drawable drawable = resources.getDrawable(i3, null);
                        bitmap3 = drawable instanceof BitmapDrawable ? ((BitmapDrawable) drawable).getBitmap() : null;
                        weakReferenceArr2[i4] = new WeakReference<>(bitmap3);
                        ucp.d.onNext(Integer.valueOf(i4));
                        ucp.c.onNext(s3q0.a);
                        ucp.s[i4].set(false);
                    }
                });
            }
            canvas.drawRect(rect, ucp.e);
        }

        public final boolean b() {
            return this.d;
        }

        @Override // xsna.cdp
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.c, ((c) obj).c);
        }

        @Override // android.graphics.drawable.Drawable
        public final Drawable.ConstantState getConstantState() {
            return this.c;
        }

        @Override // xsna.cdp
        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return "SpriteEmojiDrawable(state=" + this.c + ')';
        }

        public c(gep gepVar, int i, int i2, int i3) {
            this(new d(new e(gepVar.a, gepVar.b, gepVar.c), i, i2, i3));
        }
    }
}
