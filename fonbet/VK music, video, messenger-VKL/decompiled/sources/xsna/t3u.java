package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.DeliveryInfo;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.IntegrationInfo;
import com.vk.dto.common.MarketItemRating;
import com.vk.dto.common.MarketRejectInfo;
import com.vk.dto.common.Price;
import com.vk.dto.common.id.UserId;
import com.vk.dto.market.MarketBanner;
import com.vk.dto.market.MarketItemType;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import java.util.ArrayList;

/* compiled from: GoodBuilder.kt */
/* loaded from: classes18.dex */
public final class t3u {
    public String A;
    public Owner B;
    public MarketBanner C;
    public ArrayList D;
    public String E;
    public boolean F;
    public ArrayList G;
    public ArrayList H;
    public int I;
    public int J;
    public String K;
    public String L;
    public String M;
    public MarketRejectInfo N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public String R;
    public String S;
    public String T;
    public ArrayList U;
    public ArrayList V;
    public ArrayList W;
    public MarketItemType X;
    public long a;
    public UserId b;
    public String c;
    public String d;
    public String e;
    public Price f;
    public int g;
    public String h;
    public String i;
    public Image j;
    public int k;
    public int l;
    public DeliveryInfo m;
    public IntegrationInfo n;
    public MarketItemRating o;
    public ArrayList p;
    public Integer q;
    public int r;
    public int s;
    public ArrayList t;
    public ArrayList<Photo> u;
    public boolean v;
    public boolean w;
    public int x;
    public boolean y;
    public String z;

    public final Good a() {
        return new Good(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, 0, this.i, false, this.j, this.k, this.l, this.m, this.n, this.o, null, this.p, this.q, null, this.r, this.s, this.t, this.u, this.v, this.w, false, 0, 0, null, this.x, 0, this.y, this.z, this.A, this.B, this.C, this.D, 0, this.E, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, this.F, this.G, this.H, this.I, this.J, this.K, this.L, null, this.M, this.N, null, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X);
    }
}
