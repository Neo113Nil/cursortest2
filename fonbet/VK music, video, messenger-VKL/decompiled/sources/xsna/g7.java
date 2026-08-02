package xsna;

import android.view.ViewGroup;
import androidx.preference.Preference;
import com.vk.comments.core.BoardComment;
import com.vk.common.links.AwayLink;
import com.vk.core.view.ExpandableTextViewGroup;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.data.VKList;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vkontakte.android.fragments.videos.AddedVideosFragment;
import java.util.List;
import java.util.Map;
import kotlin.Triple;
import xsna.dgh;
import xsna.irb;
import xsna.qjc;
import xsna.rub;
import xsna.uv60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class g7 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, f0t, io.reactivex.rxjava3.functions.i, irb.c, Preference.c, qjc.a, io.reactivex.rxjava3.functions.c, h9l, io.reactivex.rxjava3.functions.h {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.qjc.a
    public void I(AwayLink awayLink) {
        d8q d8qVar = (d8q) this.c;
        T t = d8qVar.m;
        ExpandableTextViewGroup expandableTextViewGroup = d8qVar.a0;
        BoardComment boardComment = (BoardComment) t;
        if (boardComment.d) {
            boardComment.d = true;
            expandableTextViewGroup.b();
        } else {
            expandableTextViewGroup.a();
            ViewGroup.LayoutParams layoutParams = expandableTextViewGroup.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
            }
            expandableTextViewGroup.requestLayout();
        }
        boardComment.d = !boardComment.d;
        d8qVar.Y.invoke();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (List) ((n8) this.c).invoke(obj);
            case 1:
            case 3:
            case 8:
            case 9:
            case 10:
            case 11:
            case 15:
            case 16:
            case 17:
            case 20:
            case 22:
            case 26:
            case 27:
            default:
                return (io.reactivex.rxjava3.core.e) ((ebx) this.c).invoke(obj);
            case 2:
                return (it80) ((rf) this.c).invoke(obj);
            case 4:
                return (sgz) ((rf) this.c).invoke(obj);
            case 5:
                return (Map) ((rf) this.c).invoke(obj);
            case 6:
                return (Triple) ((ut6) this.c).invoke(obj);
            case 7:
                return (vo9) this.c;
            case 12:
                return (nee) ((e89) this.c).invoke(obj);
            case 13:
                return (VKList) ((com.vk.movika.sdk.base.logic.interactor.p) this.c).invoke(obj);
            case 14:
                return ((dgh.b) this.c).invoke(obj);
            case 18:
                return (it80) ((qpj) this.c).invoke(obj);
            case 19:
                return (List) ((wje) this.c).invoke(obj);
            case 21:
                return (f8w) ((x8m) this.c).invoke(obj);
            case 23:
                return (io.reactivex.rxjava3.core.t) ((ut6) this.c).invoke(obj);
            case 24:
                return (io.reactivex.rxjava3.core.b0) ((qpj) this.c).invoke(obj);
            case 25:
                return (io.reactivex.rxjava3.core.b0) ((wh9) this.c).invoke(obj);
            case 28:
                return (cfr) ((x8m) this.c).invoke(obj);
        }
    }

    @Override // xsna.irb.c
    public void b(DialogExt dialogExt, lse0 lse0Var) {
        ((tub) this.c).O(new rub.b(dialogExt, lse0Var));
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        enj.r(debugDevSettingsFragment.mo2getContext(), "Please restart the app!", 0);
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.h
    public Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        return (uv60.a) ((wii) this.c).invoke(obj, obj2, obj3, obj4);
    }

    @Override // io.reactivex.rxjava3.functions.i
    public Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return (hda) ((iaa) this.c).invoke(obj, obj2, obj3, obj4, obj5);
    }

    @Override // xsna.h9l
    public g9l provide() {
        return new j5r((ProfileFragmentProviderComponent) this.c);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                int i2 = AddedVideosFragment.n1;
                ((AddedVideosFragment) obj2).getClass();
                return obj instanceof paq0;
            case 3:
                return ((Boolean) ((com.vk.movika.sdk.base.logic.interactor.p) obj2).invoke(obj)).booleanValue();
            case 9:
                return ((Boolean) ((com.vk.movika.sdk.base.logic.interactor.p) obj2).invoke(obj)).booleanValue();
            case 11:
                return ((Boolean) ((sg3) obj2).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((rf) obj2).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
            case 20:
                return (o5t0) ((v3l) this.c).invoke(obj, obj2);
            default:
                return (gps) ((l71) this.c).invoke(obj, obj2);
        }
    }
}
