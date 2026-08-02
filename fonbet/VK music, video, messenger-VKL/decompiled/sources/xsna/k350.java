package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.vkontakte.android.R;
import kotlin.Triple;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.e3m;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class k350 implements r800 {
    public final /* synthetic */ com.vk.music.onboarding.impl.b a;
    public final /* synthetic */ FunctionReferenceImpl b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ k350(com.vk.music.onboarding.impl.b bVar, gzs gzsVar) {
        this.a = bVar;
        this.b = (FunctionReferenceImpl) gzsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    @Override // xsna.r800
    public final void onResult(Object obj) {
        Triple triple = new Triple(15, 20, 35);
        final int intValue = ((Number) triple.d()).intValue();
        final int intValue2 = ((Number) triple.g()).intValue();
        final int intValue3 = ((Number) triple.h()).intValue();
        final com.vk.music.onboarding.impl.b bVar = this.a;
        bwt0.p0(bVar.w, false);
        final LottieAnimationView lottieAnimationView = bVar.v;
        bwt0.p0(lottieAnimationView, true);
        final ?? r8 = this.b;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener(intValue, bVar, intValue2, intValue3, r8) { // from class: xsna.f350
            public final /* synthetic */ int c;
            public final /* synthetic */ com.vk.music.onboarding.impl.b d;
            public final /* synthetic */ int e;
            public final /* synthetic */ int f;
            public final /* synthetic */ FunctionReferenceImpl g;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.g = (FunctionReferenceImpl) r8;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int integer;
                int frame = LottieAnimationView.this.getFrame();
                int i = this.c;
                com.vk.music.onboarding.impl.b bVar2 = this.d;
                if (frame != i) {
                    if (frame != this.e) {
                        if (frame == this.f) {
                            bVar2.b(this.g);
                            return;
                        }
                        return;
                    } else {
                        LottieAnimationView lottieAnimationView2 = bVar2.u;
                        lottieAnimationView2.W();
                        bwt0.p0(lottieAnimationView2, false);
                        bVar2.t.j5();
                        return;
                    }
                }
                RecyclerView recyclerView = bVar2.y;
                ImageView imageView = bVar2.x;
                if (bVar2.e) {
                    imageView.setImageResource(R.drawable.ic_music_wave_tablet);
                    integer = recyclerView.getResources().getInteger(R.integer.music_recommendation_finish_artist_items_count_tablet);
                } else {
                    imageView.setImageResource(R.drawable.ic_music_wave_phone);
                    integer = recyclerView.getResources().getInteger(R.integer.music_recommendation_finish_artist_items_count_phone);
                }
                bVar2.j.setItems(bVar2.d.E(integer));
                recyclerView.scheduleLayoutAnimation();
                recyclerView.addItemDecoration(new c350(integer));
            }
        };
        k800 k800Var = lottieAnimationView.f;
        k800Var.c.addUpdateListener(animatorUpdateListener);
        lottieAnimationView.setComposition((i700) obj);
        lottieAnimationView.m0();
        if (!k800Var.m()) {
            lottieAnimationView.setFrame(intValue);
            lottieAnimationView.setFrame(intValue2);
            lottieAnimationView.setFrame(intValue3);
            lottieAnimationView.setFrame((int) lottieAnimationView.getMaxFrame());
            bVar.b(r8);
        }
        ImageView imageView = bVar.s;
        Context context = imageView.getContext();
        e3m.a aVar = e3m.a;
        imageView.setColorFilter(context.getColor(R.color.vk_white));
    }
}
