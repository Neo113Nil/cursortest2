package xsna;

import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.user.UserSex;
import java.io.File;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import ru.ok.gleffects.dto.UserInfo;

/* compiled from: ClipsEffectsApiRequestsController.kt */
/* loaded from: classes16.dex */
public final class h1e {
    public static final List<UsersFieldsDto> p = e43.l(UsersFieldsDto.FIRST_NAME_NOM, UsersFieldsDto.LAST_NAME_NOM, UsersFieldsDto.CITY, UsersFieldsDto.SEX, UsersFieldsDto.BIRTHDATE, UsersFieldsDto.BDATE, UsersFieldsDto.PHOTO_BASE);
    public final vm9 a;
    public final b25 b;
    public List<? extends UserInfo> c;
    public boolean d;
    public boolean e;
    public final bpn0 f;
    public final bpn0 g;
    public List<cc50> h;
    public final io.reactivex.rxjava3.disposables.b i;
    public UserInfo j;
    public boolean k;
    public final bpn0 l;
    public final bpn0 m;
    public final Object n;
    public final Object o;

    /* compiled from: ClipsEffectsApiRequestsController.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BaseSexDto.values().length];
            try {
                iArr[BaseSexDto.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BaseSexDto.MALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BaseSexDto.FEMALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[UserSex.values().length];
            try {
                iArr2[UserSex.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[UserSex.MALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[UserSex.FEMALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public h1e(vm9 vm9Var, b25 b25Var) {
        this.a = vm9Var;
        this.b = b25Var;
        EmptyList emptyList = EmptyList.b;
        this.c = emptyList;
        this.f = new bpn0(new f20(6));
        this.g = new bpn0(new ob0(4));
        this.h = emptyList;
        this.i = new io.reactivex.rxjava3.disposables.b();
        this.l = new bpn0(new com.vk.movika.tools.controls.seekbar.n(12));
        this.m = new bpn0(new jb(7));
        pr6 pr6Var = new pr6(4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.n = msy.a(lazyThreadSafetyMode, pr6Var);
        this.o = msy.a(lazyThreadSafetyMode, new xu0(8));
    }

    public static io.reactivex.rxjava3.internal.operators.observable.m1 a(File file, jkq0 jkq0Var) {
        return new io.reactivex.rxjava3.internal.operators.observable.i0(dug0.a(file, jkq0Var.a), new b8(new py(8), 11)).U(new mm6(new hb(jkq0Var, 27), 10)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }
}
