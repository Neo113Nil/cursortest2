package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import com.vk.api.generated.market.dto.MarketGetItemsForReviewViewTypeDto;
import com.vk.dto.common.id.UserId;
import java.util.Date;

/* compiled from: CommunityItemsForReviewDelegateImpl.kt */
/* loaded from: classes18.dex */
public final class l6h implements k6h {
    public final ajg0 a;
    public final s510 b;
    public final e610 c;
    public final a d = new a();

    /* compiled from: CommunityItemsForReviewDelegateImpl.kt */
    public static final class a implements j780 {
        public a() {
        }

        @Override // xsna.j780
        public final void a() {
            l6h.this.getClass();
        }

        @Override // xsna.j780
        public final void b() {
            l6h.this.getClass();
        }
    }

    public l6h(ajg0 ajg0Var, s510 s510Var, e610 e610Var) {
        this.a = ajg0Var;
        this.b = s510Var;
        this.c = e610Var;
    }

    @Override // xsna.k6h
    @SuppressLint({"CheckResult"})
    public final void a(MarketGetItemsForReviewViewTypeDto marketGetItemsForReviewViewTypeDto, UserId userId, px0 px0Var) {
        s510 s510Var = this.b;
        int d = s510Var.d() * 1000;
        Date c = s510Var.c();
        if (c == null || new Date().getTime() > c.getTime() + d) {
            this.c.a(marketGetItemsForReviewViewTypeDto, userId, null, null, true).subscribe(new ji3(new nvg(px0Var, 3), 16));
        }
    }

    @Override // xsna.k6h
    public final void b(Context context, UserId userId, boolean z) {
        if (z) {
            s510 s510Var = this.b;
            Integer a2 = s510Var.a();
            Date b = s510Var.b();
            Long valueOf = b != null ? Long.valueOf(b.getTime() / 1000) : null;
            long time = new Date().getTime() / 1000;
            if (a2 == null || valueOf == null || time > valueOf.longValue() + a2.intValue()) {
                this.a.c(context, userId, this.d);
            }
        }
    }
}
