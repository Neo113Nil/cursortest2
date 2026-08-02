package androidx.emoji2.emojipicker;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.bvf0;
import defpackage.bxl;
import defpackage.d0i0;
import defpackage.d2x;
import defpackage.e9e;
import defpackage.f7h0;
import defpackage.ftn;
import defpackage.g6u;
import defpackage.gth0;
import defpackage.gun;
import defpackage.ike;
import defpackage.iun;
import defpackage.j0g;
import defpackage.jeu0;
import defpackage.l3h0;
import defpackage.l4i0;
import defpackage.l8x;
import defpackage.loj;
import defpackage.m59;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.qun;
import defpackage.rcc;
import defpackage.rp31;
import defpackage.scc;
import defpackage.sjh;
import defpackage.t8j;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.tun;
import defpackage.uu6;
import defpackage.uyj;
import defpackage.vtn;
import defpackage.w511;
import defpackage.wls;
import defpackage.xfi0;
import defpackage.y3c0;
import defpackage.ytn;
import defpackage.ztn;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 [2\u00020\u0001:\u0001\\B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u000eH\u0080@¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u000e2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b\u001d\u0010!J!\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\"\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010#J+\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\"\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b\u001d\u0010$J)\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010'J\u000f\u0010(\u001a\u00020\u000eH\u0016¢\u0006\u0004\b(\u0010)J\u0019\u0010*\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b*\u0010\u001eJ\u0017\u0010+\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0006H\u0016¢\u0006\u0004\b+\u0010,J\u0019\u0010-\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b-\u0010\u001eJ\u001f\u00100\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006H\u0016¢\u0006\u0004\b2\u00101J\u000f\u00104\u001a\u000203H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000eH\u0002¢\u0006\u0004\b6\u0010)R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R*\u0010;\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010,R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010FR\u0016\u0010H\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020K0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010O\u001a\u00020N8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010Q\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010S\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bS\u0010TR\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010UR$\u0010Z\u001a\u0002072\u0006\u0010:\u001a\u0002078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010W\"\u0004\bX\u0010Y¨\u0006]"}, d2 = {"Landroidx/emoji2/emojipicker/EmojiPickerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lztn;", "buildEmojiPickerItems$emoji2_emojipicker_release", "()Lztn;", "buildEmojiPickerItems", "Lzy11;", "refreshRecent$emoji2_emojipicker_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshRecent", "Le9e;", "Ltun;", "onEmojiPickedListener", "setOnEmojiPickedListener", "(Le9e;)V", "Lxfi0;", "recentEmojiProvider", "setRecentEmojiProvider", "(Lxfi0;)V", "Landroid/view/View;", "child", "addView", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "index", "(Landroid/view/View;I)V", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "width", "height", "(Landroid/view/View;II)V", "removeAllViews", "()V", "removeView", "removeViewAt", "(I)V", "removeViewInLayout", "start", "count", "removeViews", "(II)V", "removeViewsInLayout", "Lvtn;", "createEmojiPickerBodyAdapter", "()Lvtn;", "showEmojiPickerView", "", "_emojiGridRows", "Ljava/lang/Float;", "value", "emojiGridColumns", CA20Status.STATUS_USER_I, "getEmojiGridColumns", "()I", "setEmojiGridColumns", "Ljeu0;", "stickyVariantProvider", "Ljeu0;", "Ltse;", "scope", "Ltse;", "Lxfi0;", "", "recentNeedsRefreshing", "Z", "", "Lqun;", "recentItems", "Ljava/util/List;", "Ld2x;", "recentItemGroup", "Ld2x;", "emojiPickerItems", "Lztn;", "bodyAdapter", "Lvtn;", "Le9e;", "getEmojiGridRows", "()F", "setEmojiGridRows", "(F)V", "emojiGridRows", "Companion", "gun", "emoji2-emojipicker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EmojiPickerView extends FrameLayout {
    public static final gun Companion = new gun();
    private static boolean emojiCompatLoaded;
    private Float _emojiGridRows;
    private vtn bodyAdapter;
    private int emojiGridColumns;
    private ztn emojiPickerItems;
    private e9e onEmojiPickedListener;
    private xfi0 recentEmojiProvider;
    private d2x recentItemGroup;
    private final List<qun> recentItems;
    private boolean recentNeedsRefreshing;
    private final tse scope;
    private final jeu0 stickyVariantProvider;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
    @mvg(c = "androidx.emoji2.emojipicker.EmojiPickerView$3", f = "EmojiPickerView.kt", l = {143, 144, HProv.PP_CONTAINER_STATUS}, m = "invokeSuspend")
    /* renamed from: androidx.emoji2.emojipicker.EmojiPickerView$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements wls {
        final /* synthetic */ Context $context;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ EmojiPickerView this$0;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
        @mvg(c = "androidx.emoji2.emojipicker.EmojiPickerView$3$1", f = "EmojiPickerView.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.emoji2.emojipicker.EmojiPickerView$3$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements wls {
            int label;
            final /* synthetic */ EmojiPickerView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(EmojiPickerView emojiPickerView, Continuation continuation) {
                super(2, continuation);
                this.this$0 = emojiPickerView;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
                zy11 zy11Var = zy11.a;
                anonymousClass1.invokeSuspend(zy11Var);
                return zy11Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                this.this$0.showEmojiPickerView();
                return zy11.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Context context, EmojiPickerView emojiPickerView, Continuation continuation) {
            super(2, continuation);
            this.this$0 = emojiPickerView;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$context, this.this$0, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
        
            if (defpackage.tje.k0(r8, r1, r7) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
        
            if (r1.u0(r7) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
        
            if (r8.refreshRecent$emoji2_emojipicker_release(r7) == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            l8x N;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                N = tje.N((tse) this.L$0, null, null, new EmojiPickerView$3$load$1(this.$context, null), 3);
                EmojiPickerView emojiPickerView = this.this$0;
                this.L$0 = N;
                this.label = 1;
            } else if (i == 1) {
                N = (l8x) this.L$0;
                kotlin.b.b(obj);
            } else {
                if (i != 2) {
                    if (i == 3) {
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                sjh sjhVar = uyj.a;
                g6u g6uVar = o400.a;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 3;
            }
            this.L$0 = null;
            this.label = 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0063, code lost:
    
        if (r7 != 3) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EmojiPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.emojiGridColumns = 9;
        this.stickyVariantProvider = new jeu0(context);
        ike a = bvf0.a(EmptyCoroutineContext.a);
        this.scope = a;
        this.recentEmojiProvider = new j0g(context);
        this.recentNeedsRefreshing = true;
        this.recentItems = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l4i0.EmojiPickerView, 0, 0);
        int i2 = l4i0.EmojiPickerView_emojiGridRows;
        this._emojiGridRows = obtainStyledAttributes.hasValue(i2) ? Float.valueOf(obtainStyledAttributes.getFloat(i2, 0.0f)) : null;
        setEmojiGridColumns(obtainStyledAttributes.getInt(l4i0.EmojiPickerView_emojiGridColumns, 9));
        obtainStyledAttributes.recycle();
        if (ftn.e()) {
            int c = ftn.a().c();
            if (c != 0) {
                if (c == 1) {
                    emojiCompatLoaded = true;
                }
            }
            ftn.a().k(new c(this, context));
        }
        sjh sjhVar = uyj.a;
        tje.N(a, mdh.b, null, new AnonymousClass3(context, this, null), 2);
    }

    private final vtn createEmojiPickerBodyAdapter() {
        return new vtn(getContext(), this.emojiGridColumns, this._emojiGridRows, this.stickyVariantProvider, new bxl(29, this), new loj(13, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ztn createEmojiPickerBodyAdapter$lambda$3(EmojiPickerView emojiPickerView) {
        ztn ztnVar = emojiPickerView.emojiPickerItems;
        if (ztnVar == null) {
            return null;
        }
        return ztnVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 createEmojiPickerBodyAdapter$lambda$4(EmojiPickerView emojiPickerView, vtn vtnVar, tun tunVar) {
        e9e e9eVar = emojiPickerView.onEmojiPickedListener;
        if (e9eVar != null) {
            e9eVar.accept(tunVar);
        }
        xfi0 xfi0Var = emojiPickerView.recentEmojiProvider;
        String str = tunVar.a;
        j0g j0gVar = (j0g) xfi0Var;
        ArrayList arrayList = (ArrayList) j0gVar.b;
        arrayList.remove(str);
        arrayList.add(0, str);
        ((SharedPreferences) j0gVar.a).edit().putString("pref_key_recent_emoji", kotlin.collections.a.X(arrayList, ",", null, null, null, 62)).commit();
        emojiPickerView.recentNeedsRefreshing = true;
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showEmojiPickerView() {
        this.emojiPickerItems = buildEmojiPickerItems$emoji2_emojipicker_release();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), this.emojiGridColumns, 1, false);
        gridLayoutManager.h0 = new iun(this);
        Context context = getContext();
        ztn ztnVar = this.emojiPickerItems;
        if (ztnVar == null) {
            ztnVar = null;
        }
        ytn ytnVar = new ytn(context, ztnVar, new t8j(27, this, gridLayoutManager));
        super.removeAllViews();
        View inflate = View.inflate(getContext(), gth0.emoji_picker, this);
        int i = f7h0.emoji_picker_header;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        RecyclerView recyclerView = (RecyclerView) ((View) rp31.d(inflate, i));
        final Context context2 = recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(context2) { // from class: androidx.emoji2.emojipicker.EmojiPickerView$showEmojiPickerView$1$1$1
            @Override // androidx.recyclerview.widget.RecyclerView.e
            public final boolean K(RecyclerView.LayoutParams layoutParams) {
                ztn ztnVar2;
                int paddingStart = (this.H - getPaddingStart()) - getPaddingEnd();
                ztnVar2 = EmojiPickerView.this.emojiPickerItems;
                if (ztnVar2 == null) {
                    ztnVar2 = null;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).width = paddingStart / ztnVar2.a.size();
                return true;
            }
        });
        recyclerView.setAdapter(ytnVar);
        RecyclerView recyclerView2 = (RecyclerView) ((View) rp31.d(inflate, f7h0.emoji_picker_body));
        recyclerView2.setLayoutManager(gridLayoutManager);
        vtn createEmojiPickerBodyAdapter = createEmojiPickerBodyAdapter();
        createEmojiPickerBodyAdapter.setHasStableIds(true);
        this.bodyAdapter = createEmojiPickerBodyAdapter;
        recyclerView2.setAdapter(createEmojiPickerBodyAdapter);
        recyclerView2.addOnScrollListener(new d(ytnVar, this, gridLayoutManager));
        recyclerView2.setItemAnimator(null);
        RecyclerView.h hVar = new RecyclerView.h();
        hVar.e(ItemType.EMOJI.ordinal(), 100);
        recyclerView2.setRecycledViewPool(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showEmojiPickerView$lambda$10(EmojiPickerView emojiPickerView, GridLayoutManager gridLayoutManager, int i) {
        ztn ztnVar = emojiPickerView.emojiPickerItems;
        if (ztnVar == null) {
            ztnVar = null;
        }
        int a = ztnVar.a(i);
        ztn ztnVar2 = emojiPickerView.emojiPickerItems;
        if (ztnVar2 == null) {
            ztnVar2 = null;
        }
        d2x d2xVar = emojiPickerView.recentItemGroup;
        if (d2xVar == null) {
            d2xVar = null;
        }
        if (a == ztnVar2.d(d2xVar).a) {
            tje.N(emojiPickerView.scope, null, null, new EmojiPickerView$showEmojiPickerView$headerAdapter$1$1$1(emojiPickerView, null), 3);
        }
        gridLayoutManager.r(a, 0);
        emojiPickerView.invalidate();
        return zy11.a;
    }

    @Override // android.view.ViewGroup
    public void addView(View child) {
        if (getChildCount() <= 0) {
            super.addView(child);
        } else {
            w511.x("Adding views to the EmojiPickerView is unsupported");
        }
    }

    public final ztn buildEmojiPickerItems$emoji2_emojipicker_release() {
        ListBuilder a = rcc.a();
        d2x d2xVar = new d2x(l3h0.quantum_gm_ic_access_time_filled_vd_theme_24, new m59(getContext().getString(d0i0.emoji_category_recent)), this.recentItems, Integer.valueOf(this.emojiGridColumns * 3), new y3c0(getContext().getString(d0i0.emoji_empty_recent_category)));
        this.recentItemGroup = d2xVar;
        a.add(d2xVar);
        List<uu6> list = a.b;
        if (list == null) {
            ny61.r("BundledEmojiListLoader.load is not called or complete");
            return null;
        }
        int i = 0;
        for (uu6 uu6Var : list) {
            int i2 = i + 1;
            int i3 = uu6Var.a;
            m59 m59Var = new m59(uu6Var.b);
            List list2 = uu6Var.c;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            int i4 = 0;
            for (Object obj : list2) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    scc.m();
                    throw null;
                }
                jeu0 jeu0Var = this.stickyVariantProvider;
                String str = ((tun) obj).a;
                String str2 = (String) ((Map) jeu0Var.b.getValue()).get(str);
                if (str2 != null) {
                    str = str2;
                }
                arrayList.add(new qun(str, i4 + i, 2));
                i4 = i5;
            }
            a.add(new d2x(i3, m59Var, arrayList, null, null));
            i = i2;
        }
        return new ztn(a.j());
    }

    public final int getEmojiGridColumns() {
        return this.emojiGridColumns;
    }

    public final float getEmojiGridRows() {
        Float f = this._emojiGridRows;
        if (f != null) {
            return f.floatValue();
        }
        return -1.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        if (r9 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refreshRecent$emoji2_emojipicker_release(Continuation<? super zy11> continuation) {
        EmojiPickerView$refreshRecent$1 emojiPickerView$refreshRecent$1;
        int i;
        int b;
        if (continuation instanceof EmojiPickerView$refreshRecent$1) {
            emojiPickerView$refreshRecent$1 = (EmojiPickerView$refreshRecent$1) continuation;
            int i2 = emojiPickerView$refreshRecent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                emojiPickerView$refreshRecent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = emojiPickerView$refreshRecent$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = emojiPickerView$refreshRecent$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (this.recentNeedsRefreshing) {
                        d2x d2xVar = this.recentItemGroup;
                        b = d2xVar != null ? d2xVar.b() : 0;
                        xfi0 xfi0Var = this.recentEmojiProvider;
                        emojiPickerView$refreshRecent$1.I$0 = b;
                        emojiPickerView$refreshRecent$1.label = 1;
                        obj = (ArrayList) ((j0g) xfi0Var).b;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b = emojiPickerView$refreshRecent$1.I$0;
                kotlin.b.b(obj);
                sjh sjhVar = uyj.a;
                g6u g6uVar = o400.a;
                EmojiPickerView$refreshRecent$2 emojiPickerView$refreshRecent$2 = new EmojiPickerView$refreshRecent$2(this, (List) obj, b, null);
                emojiPickerView$refreshRecent$1.label = 2;
                return tje.k0(g6uVar, emojiPickerView$refreshRecent$2, emojiPickerView$refreshRecent$1) != obj2 ? obj2 : zy11Var;
            }
        }
        emojiPickerView$refreshRecent$1 = new EmojiPickerView$refreshRecent$1(this, continuation);
        Object obj3 = emojiPickerView$refreshRecent$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = emojiPickerView$refreshRecent$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        sjh sjhVar2 = uyj.a;
        g6u g6uVar2 = o400.a;
        EmojiPickerView$refreshRecent$2 emojiPickerView$refreshRecent$22 = new EmojiPickerView$refreshRecent$2(this, (List) obj3, b, null);
        emojiPickerView$refreshRecent$1.label = 2;
        if (tje.k0(g6uVar2, emojiPickerView$refreshRecent$22, emojiPickerView$refreshRecent$1) != obj22) {
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        throw new UnsupportedOperationException("Removing views from the EmojiPickerView is unsupported");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View child) {
        throw new UnsupportedOperationException("Removing views from the EmojiPickerView is unsupported");
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int index) {
        throw new UnsupportedOperationException("Removing views from the EmojiPickerView is unsupported");
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View child) {
        throw new UnsupportedOperationException("Removing views from the EmojiPickerView is unsupported");
    }

    @Override // android.view.ViewGroup
    public void removeViews(int start, int count) {
        throw new UnsupportedOperationException("Removing views from the EmojiPickerView is unsupported");
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int start, int count) {
        throw new UnsupportedOperationException("Removing views from the EmojiPickerView is unsupported");
    }

    public final void setEmojiGridColumns(int i) {
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        this.emojiGridColumns = valueOf != null ? valueOf.intValue() : 9;
        if (isLaidOut()) {
            showEmojiPickerView();
        }
    }

    public final void setEmojiGridRows(float f) {
        Float valueOf = Float.valueOf(f);
        if (valueOf.floatValue() <= 0.0f) {
            valueOf = null;
        }
        this._emojiGridRows = valueOf;
        if (isLaidOut()) {
            showEmojiPickerView();
        }
    }

    public final void setOnEmojiPickedListener(e9e onEmojiPickedListener) {
        this.onEmojiPickedListener = onEmojiPickedListener;
    }

    public final void setRecentEmojiProvider(xfi0 recentEmojiProvider) {
        this.recentEmojiProvider = recentEmojiProvider;
        tje.N(this.scope, null, null, new EmojiPickerView$setRecentEmojiProvider$1(this, null), 3);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View child, ViewGroup.LayoutParams params) {
        if (getChildCount() <= 0) {
            super.addView(child, params);
        } else {
            w511.x("Adding views to the EmojiPickerView is unsupported");
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index) {
        if (getChildCount() <= 0) {
            super.addView(child, index);
        } else {
            w511.x("Adding views to the EmojiPickerView is unsupported");
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        if (getChildCount() <= 0) {
            super.addView(child, index, params);
        } else {
            w511.x("Adding views to the EmojiPickerView is unsupported");
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int width, int height) {
        if (getChildCount() <= 0) {
            super.addView(child, width, height);
        } else {
            w511.x("Adding views to the EmojiPickerView is unsupported");
        }
    }

    public EmojiPickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ EmojiPickerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public EmojiPickerView(Context context) {
        this(context, null, 0, 6, null);
    }
}
