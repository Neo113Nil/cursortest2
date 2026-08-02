package xsna;

import androidx.preference.Preference;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.vk.api.base.VkPaginationList;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.attachpicker.impl.fragment.video.AttachVideoFragment;
import com.vk.auth.entername.EnterProfileContract$BirthdayErrorType;
import com.vk.auth.entername.EnterProfilePresenter;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.articles.Article;
import com.vk.dto.common.id.UserId;
import com.vk.onboarding.demo.DebugVkOnboardingFragment;
import com.vk.photogallery.LocalGalleryProvider;
import io.reactivex.rxjava3.internal.operators.maybe.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;
import xsna.bzp0;
import xsna.fl6;
import xsna.ngl;
import xsna.rfb0;
import xsna.tq70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class x34 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.i, io.reactivex.rxjava3.functions.c, Preference.c, ngl.a, tq70.b, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.core.n {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x34(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.tq70.b
    public void accept(Object obj) {
        ((rfb0.a) obj).f((VKApiExecutionException) ((Throwable) this.c));
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        wc1 loadDefaultAlbum$lambda$6;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                int i2 = AttachVideoFragment.F0;
                return (VkPaginationList) ((w34) obj2).invoke(obj);
            case 1:
                return (UserId) ((pl2) obj2).invoke(obj);
            case 2:
            case 6:
            case 11:
            case 14:
            case 19:
            case 20:
            default:
                return (utk) ((w34) obj2).invoke(obj);
            case 3:
                return (wt2) ((wz) obj2).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.t) ((s53) obj2).invoke(obj);
            case 5:
                return ((y2b) obj2).c;
            case 7:
                return (u2e) ((ur0) obj2).invoke(obj);
            case 8:
                return (io.reactivex.rxjava3.core.b0) ((hbe) obj2).invoke(obj);
            case 9:
                return (String) ((ur0) obj2).invoke(obj);
            case 10:
                return (Boolean) ((izs) obj2).invoke(obj);
            case 12:
                return (Long) ((ur0) obj2).invoke(obj);
            case 13:
                return (List) ((s55) obj2).invoke(obj);
            case 15:
                return (tav) ((kf8) obj2).invoke(obj);
            case 16:
                loadDefaultAlbum$lambda$6 = LocalGalleryProvider.loadDefaultAlbum$lambda$6((sop) obj2, obj);
                return loadDefaultAlbum$lambda$6;
            case 17:
                return (Integer) ((quz) obj2).invoke(obj);
            case 18:
                return (io.reactivex.rxjava3.core.e) ((o440) obj2).invoke(obj);
            case 21:
                return (xg60) ((o440) obj2).invoke(obj);
            case 22:
                return (lu60) ((bm60) obj2).invoke(obj);
            case 23:
                return (io.reactivex.rxjava3.core.e) ((quz) obj2).invoke(obj);
            case 24:
                return (io.reactivex.rxjava3.core.b0) ((o440) obj2).invoke(obj);
            case 25:
                return (io.reactivex.rxjava3.core.e) ((o440) obj2).invoke(obj);
            case 26:
                return (Article) ((quz) obj2).invoke(obj);
        }
    }

    @Override // xsna.ngl.a
    public void e(bzp0.c cVar) {
        EnterProfilePresenter enterProfilePresenter = (EnterProfilePresenter) this.c;
        wz2 wz2Var = cVar.b;
        cfv0 cfv0Var = wz2Var instanceof cfv0 ? (cfv0) wz2Var : null;
        if (cfv0Var == null) {
            return;
        }
        int i = cfv0Var.d;
        EnterProfileContract$BirthdayErrorType enterProfileContract$BirthdayErrorType = i == 1105 ? EnterProfileContract$BirthdayErrorType.TOO_OLD : i == 1106 ? EnterProfileContract$BirthdayErrorType.TOO_YOUNG : EnterProfileContract$BirthdayErrorType.INCORRECT_DATE;
        jpp jppVar = (jpp) enterProfilePresenter.a;
        if (jppVar != null) {
            jppVar.E4(enterProfileContract$BirthdayErrorType);
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        debugDevSettingsFragment.getClass();
        new DebugVkOnboardingFragment.a(DebugVkOnboardingFragment.class, null, null).k(debugDevSettingsFragment.mo2getContext());
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.i
    public Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return (fl6.a) ((cl6) this.c).invoke(obj, obj2, obj3, obj4, obj5);
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0031: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:50), block:B:25:0x0031 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d A[Catch: all -> 0x0048, TRY_ENTER, TryCatch #3 {all -> 0x0048, blocks: (B:3:0x0011, B:5:0x0017, B:11:0x002b, B:13:0x0045, B:27:0x004d, B:28:0x0050, B:19:0x0041), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    @Override // io.reactivex.rxjava3.core.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void subscribe(io.reactivex.rxjava3.core.l lVar) {
        FileInputStream fileInputStream;
        InputStream inputStream;
        uy90 uy90Var = ((hvg0) this.c).a;
        ReentrantReadWriteLock.ReadLock readLock = ((ReentrantReadWriteLock) uy90Var.c).readLock();
        readLock.lock();
        try {
            Message message = (Message) uy90Var.d;
            if (message == null) {
                File file = (File) uy90Var.a;
                InputStream inputStream2 = null;
                try {
                    try {
                        fileInputStream = new FileInputStream(file);
                        try {
                            Message message2 = (Message) ((ProtoAdapter) uy90Var.b).decode(fileInputStream);
                            fileInputStream.close();
                            message = message2;
                        } catch (FileNotFoundException e) {
                            e = e;
                            if (file.exists()) {
                                throw e;
                            }
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            message = null;
                            uy90Var.d = message;
                            if (message != null) {
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        inputStream2 = inputStream;
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        throw th;
                    }
                } catch (FileNotFoundException e2) {
                    e = e2;
                    fileInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (inputStream2 != null) {
                    }
                    throw th;
                }
                uy90Var.d = message;
            }
            if (message != null) {
                ((c.a) lVar).d();
            } else {
                ((c.a) lVar).f(message);
            }
        } finally {
            readLock.unlock();
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 20:
                return ((Boolean) ((quz) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((o440) this.c).invoke(obj)).booleanValue();
        }
    }

    public /* synthetic */ x34(g250 g250Var, Throwable th) {
        this.b = 19;
        this.c = th;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (Pair) ((bb9) this.c).invoke(obj, obj2);
    }
}
