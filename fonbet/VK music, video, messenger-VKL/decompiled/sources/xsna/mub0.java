package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.attachpicker.PhotoVideoAttachActivity;
import com.vk.core.fragments.BaseFragment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.Poll;
import com.vk.dto.polls.PollFilterParams;
import com.vk.poll.fragments.PollEditorFragment;
import com.vk.poll.fragments.PollResultsFragment;
import com.vk.poll.fragments.PollVotersFragment;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.search.params.api.City;
import com.vk.search.params.api.VkPollSearchParams;
import com.vk.superapp.api.dto.identity.WebCity;
import com.vk.webapp.fragments.ReportFragment;
import com.vkontakte.android.TabletDialogActivity;
import com.vkontakte.android.attachments.PollAttachment;
import java.io.File;
import xsna.cqb0;

/* compiled from: PollsVkBridgeImpl.kt */
/* loaded from: classes4.dex */
public final class mub0 implements lub0 {
    public final ProfileFragmentProviderComponent a;

    public mub0(ProfileFragmentProviderComponent profileFragmentProviderComponent) {
        this.a = profileFragmentProviderComponent;
    }

    @Override // xsna.lub0
    public final void a(PollResultsFragment pollResultsFragment, kn20 kn20Var) {
        pollResultsFragment.eo(ysg0.b.a.b0(cqb0.a.class).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new wmz(new nt10(kn20Var, this), 15)));
    }

    @Override // xsna.lub0
    public final boolean b() {
        return true;
    }

    @Override // xsna.lub0
    public final void b0(Poll poll) {
        ce60.b.getClass();
        p870.f().e(120, new PollAttachment(poll));
    }

    @Override // xsna.lub0
    public final void c(String str, UserId userId, xc50 xc50Var) {
        com.vk.upload.impl.tasks.r rVar = new com.vk.upload.impl.tasks.r(str, userId);
        inb0 inb0Var = new inb0(Integer.valueOf(rVar.d), null, 0, str, 48);
        try {
            int t = ahn.t(new File(drm0.U(str, "file://")));
            Bitmap decodeFile = BitmapFactory.decodeFile(com.vk.core.files.a.K(Uri.parse(str)));
            inb0Var.e = decodeFile;
            if (t != 0) {
                inb0Var.e = kd7.k(decodeFile, t, false);
            }
        } catch (Exception unused) {
        }
        xc50Var.invoke(inb0Var);
        com.vk.upload.impl.a.i(rVar);
    }

    @Override // xsna.lub0
    public final void d(PollEditorFragment.a aVar) {
        TabletDialogActivity.a d = rfc0.d();
        d.b.putInt("theme", dhr0.C().c);
        qz50.a(aVar, d);
    }

    @Override // xsna.lub0
    public final void e(bqz0 bqz0Var, FragmentActivity fragmentActivity, PollFilterParams pollFilterParams, FragmentManager fragmentManager) {
        VkPollSearchParams vkPollSearchParams = new VkPollSearchParams();
        WebCity webCity = pollFilterParams.c;
        vkPollSearchParams.b = webCity != null ? new City(webCity.b, webCity.c, null, null, 12, null) : null;
        vkPollSearchParams.c = pollFilterParams.d;
        vkPollSearchParams.d = pollFilterParams.e;
        new dxh0(fragmentActivity, new cqb0(bqz0Var, vkPollSearchParams, fragmentActivity)).a(fragmentManager);
    }

    @Override // xsna.lub0
    public final boolean f() {
        return true;
    }

    @Override // xsna.lub0
    public final void g() {
        ysg0.b.a(new cqb0.a(new VkPollSearchParams()));
    }

    @Override // xsna.lub0
    public final void h(BaseFragment baseFragment) {
        Intent intent = new Intent(baseFragment.getActivity(), (Class<?>) PhotoVideoAttachActivity.class);
        intent.putExtra("selection_limit", 1);
        intent.putExtra("single_mode", true);
        intent.putExtra("inner_camera_enabled", true);
        baseFragment.startActivityForResult(intent, 50);
    }

    @Override // xsna.lub0
    public final PollVotersFragment.a i(int i, long j, UserId userId, String str) {
        return new PollVotersFragment.a(i, j, userId, str);
    }

    @Override // xsna.lub0
    public final void j(int i) {
        com.vk.upload.impl.a.b(i, null);
    }

    @Override // xsna.lub0
    public final void k(Context context, Poll poll) {
        int i = ReportFragment.a0;
        ReportFragment.a a = ReportFragment.b.a();
        a.K(poll.j ? "board_poll" : "poll");
        a.D(poll.b);
        a.G(poll.c);
        a.k(context);
    }

    @Override // xsna.lub0
    public final void l(Context context, UserId userId) {
        ProfileFragmentProviderComponent.Companion companion = ProfileFragmentProviderComponent.Companion;
        this.a.ye(userId, null).k(context);
    }
}
