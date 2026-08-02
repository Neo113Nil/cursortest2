package xsna;

import com.vk.dto.common.id.UserId;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import kotlin.LazyThreadSafetyMode;

/* compiled from: CommunitySectionsFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class g1i {
    public io.reactivex.rxjava3.disposables.c c;
    public io.reactivex.rxjava3.disposables.c d;
    public final i1i a = new i1i(new d690());
    public final Object b = msy.a(LazyThreadSafetyMode.NONE, new x5(12));
    public final f4z<l1h> e = new f4z<>();

    /* compiled from: CommunitySectionsFeatureDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ExtendedCommunityProfile.Section.Type.values().length];
            try {
                iArr[ExtendedCommunityProfile.Section.Type.Photos.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExtendedCommunityProfile.Section.Type.Products.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ExtendedCommunityProfile.Section.Type.Discussions.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ExtendedCommunityProfile.Section.Type.Services.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ExtendedCommunityProfile.Section.Type.Channel.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ExtendedCommunityProfile.Section.Type.Narratives.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ExtendedCommunityProfile.Section.Type.Music.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ExtendedCommunityProfile.Section.Type.Podcasts.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ExtendedCommunityProfile.Section.Type.Articles.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ExtendedCommunityProfile.Section.Type.Chats.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ExtendedCommunityProfile.Section.Type.Files.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ExtendedCommunityProfile.Section.Type.Events.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final void a(ExtendedCommunityProfile extendedCommunityProfile, gzs<s3q0> gzsVar) {
        extendedCommunityProfile.d3 = ExtendedCommunityProfile.e.c.a;
        gzsVar.invoke();
        io.reactivex.rxjava3.disposables.c cVar = this.c;
        if (cVar != null) {
            cVar.dispose();
        }
        UserId i = bwd0.i(extendedCommunityProfile);
        this.a.a.getClass();
        tfx tfxVar = new tfx("owners.getContentSections", new s11(22), new gp(27));
        tfx.n(tfxVar, "owner_id", i, 0L, 0L, 12);
        this.c = rsg0.w0(yfb.x(tfxVar)).l(new m40(new od3(21), 8)).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new f40(new v53(9, extendedCommunityProfile, gzsVar), 12), new bw(new h1(9, extendedCommunityProfile, gzsVar), 19));
    }
}
