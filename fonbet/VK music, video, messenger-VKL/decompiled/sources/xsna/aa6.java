package xsna;

import androidx.preference.Preference;
import com.vk.api.base.VkPaginationList;
import com.vk.channels.api.Channel;
import com.vk.clips.design.view.seek.ClipsSeekBar;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.data.VKList;
import com.vk.im.ui.fragments.dialogtheme.ImSettingsDialogThemeFragment;
import com.vkontakte.android.R;
import java.util.List;
import xsna.ea6;
import xsna.eeu0;
import xsna.h7u0;
import xsna.lta;
import xsna.mwm;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class aa6 implements io.reactivex.rxjava3.functions.l, ClipsSeekBar.a, io.reactivex.rxjava3.functions.m, Preference.c, io.reactivex.rxjava3.functions.c {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aa6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // com.vk.clips.design.view.seek.ClipsSeekBar.a
    public void a(float f) {
        ((rwd) this.c).e.l(f);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (List) ((u8c) this.c).invoke((List) obj, obj2);
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        o2l.a.getClass();
        String c = o2l.c("__dbg_video_ad_creative_type", "");
        eeu0.a.C2801a c2801a = new eeu0.a.C2801a(new h7u0.a(debugDevSettingsFragment.requireContext()));
        c2801a.b = "Video ad creativeType";
        c2801a.s = new byc(c, 1);
        c2801a.c(R.string.ok, new nw6(debugDevSettingsFragment, 5), true);
        c2801a.g();
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 11:
                break;
            case 13:
                break;
            case 14:
                break;
            case 16:
                break;
            case 18:
                break;
            case 19:
                break;
            case 27:
                break;
        }
        return ((Boolean) ((leq) this.c).invoke(obj)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (ea6.e) ((z96) obj2).invoke(obj);
            case 1:
                return (ao50) ((g60) obj2).invoke(obj);
            case 2:
                return (ta40) ((g60) obj2).invoke(obj);
            case 3:
                return (Boolean) ((dz) obj2).invoke(obj);
            case 4:
                return (List) ((nt) obj2).invoke(obj);
            case 5:
                return (Channel) ((fh1) obj2).invoke(obj);
            case 6:
                return (io.reactivex.rxjava3.core.t) ((nt) obj2).invoke(obj);
            case 7:
            case 11:
            case 12:
            case 13:
            case 14:
            case 16:
            case 18:
            case 19:
            case 23:
            default:
                int i2 = ImSettingsDialogThemeFragment.c0;
                return (io.reactivex.rxjava3.core.e) ((leq) obj2).invoke(obj);
            case 8:
                return (io.reactivex.rxjava3.core.t) ((nt) obj2).invoke(obj);
            case 9:
                return (ClipsPlaylist) ((nt) obj2).invoke(obj);
            case 10:
                return (VKList) ((x4c) obj2).invoke(obj);
            case 15:
                return (lta.a) ((p4f) obj2).invoke(obj);
            case 17:
                return (mwm.a) ((p4f) obj2).invoke(obj);
            case 20:
                return (io.reactivex.rxjava3.core.b0) ((dzr) obj2).invoke(obj);
            case 21:
                return (els) ((leq) obj2).invoke(obj);
            case 22:
                return (VkPaginationList) ((p4f) obj2).invoke(obj);
            case 24:
                return (q1a0) ((leq) obj2).invoke(obj);
            case 25:
                return (wfg0) ((ug8) obj2).invoke(obj);
        }
    }
}
