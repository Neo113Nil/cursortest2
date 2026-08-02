package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.VKTabLayout;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.log.L;
import com.vk.posting.presentation.model.PickerAttachType;
import com.vk.posting.presentation.model.PickerRootParams;
import com.vk.posting.presentation.root.PickerRootFragment;
import com.vkontakte.android.R;
import java.lang.reflect.Field;
import kotlin.NoWhenBranchMatchedException;
import xsna.gm50;
import xsna.tlo0;

/* compiled from: PickerRootView.kt */
/* loaded from: classes5.dex */
public final class qia0 implements gm50 {
    public final PickerRootParams b;
    public final PickerRootFragment c;
    public final oga0 d;
    public final rop e;
    public final f5z f;
    public final View g;
    public final VKTabLayout h;
    public final ViewPager2 i;
    public final View j;
    public final com.google.android.material.tabs.c k;

    public qia0(Context context, f5z f5zVar, PickerRootParams pickerRootParams, PickerRootFragment pickerRootFragment, PickerRootFragment pickerRootFragment2, oga0 oga0Var, rop ropVar) {
        String string;
        this.b = pickerRootParams;
        this.c = pickerRootFragment2;
        this.d = oga0Var;
        this.e = ropVar;
        this.f = f5zVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.fragment_root_picker, (ViewGroup) null);
        this.g = inflate;
        VKTabLayout vKTabLayout = (VKTabLayout) inflate.findViewById(R.id.tab_layout);
        this.h = vKTabLayout;
        ViewPager2 viewPager2 = (ViewPager2) inflate.findViewById(R.id.viewpager);
        this.i = viewPager2;
        this.j = inflate.findViewById(R.id.separator);
        VkTopBar vkTopBar = (VkTopBar) inflate.findViewById(R.id.topbar);
        vkTopBar.setBack(new VkTopBar.b(new f5x(this, 28), tq.h(tlo0.Companion, R.string.accessibility_toolbar_back), null, null, null, 28));
        PickerAttachType pickerAttachType = pickerRootParams.d;
        if (epx.f(pickerAttachType, PickerAttachType.Article.b)) {
            string = context.getString(R.string.article_picker_title);
        } else if (epx.f(pickerAttachType, PickerAttachType.Album.b)) {
            string = context.getString(R.string.album_picker_title);
        } else if (epx.f(pickerAttachType, PickerAttachType.PhotoVk.b)) {
            string = context.getString(R.string.photo_vk_picker_title);
        } else {
            if (!(pickerAttachType instanceof PickerAttachType.VideoVk)) {
                throw new NoWhenBranchMatchedException();
            }
            string = context.getString(R.string.video_vk_picker_title);
        }
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(string, (e4) null, (VkTopBar.Middle.Text.Title.a) null, (VkTopBar.Middle.Text.Title.Size) null, 14), null, null, null, 14));
        if (pickerAttachType instanceof PickerAttachType.VideoVk) {
            vkTopBar.setAfter(VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new gko(R.drawable.vk_icon_search_outline_28), new tlo0.f(R.string.accessibility_search), new ag20(this, 20), null, null, null, 56), null, 6));
        }
        viewPager2.setAdapter(new uia0(pickerRootFragment, viewPager2, pickerRootFragment.D, pickerRootFragment.In().a, pickerRootParams, oga0Var));
        try {
            Field declaredField = ViewPager2.class.getDeclaredField(CampaignEx.JSON_KEY_AD_K);
            declaredField.setAccessible(true);
            RecyclerView recyclerView = (RecyclerView) declaredField.get(viewPager2);
            Field declaredField2 = RecyclerView.class.getDeclaredField("mTouchSlop");
            declaredField2.setAccessible(true);
            declaredField2.set(recyclerView, Integer.valueOf(((Integer) declaredField2.get(recyclerView)).intValue() * 3));
        } catch (Exception e) {
            L.i(e);
        }
        com.google.android.material.tabs.c cVar = new com.google.android.material.tabs.c(vKTabLayout, viewPager2, new wx40(this, 1));
        cVar.a();
        this.k = cVar;
        viewPager2.b(new pia0(this));
        boolean z = pickerRootParams.c != null;
        viewPager2.setUserInputEnabled(z);
        bwt0.p0(vKTabLayout, z);
        bwt0.p0(this.j, z && !epx.f(pickerAttachType, PickerAttachType.Album.b));
    }

    public final void a() {
        ViewPager2 viewPager2 = this.i;
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        FragmentImpl fragmentImpl = null;
        uia0 uia0Var = adapter instanceof uia0 ? (uia0) adapter : null;
        if (uia0Var != null) {
            Fragment F0 = uia0Var.F0(viewPager2.getCurrentItem());
            if (F0 instanceof FragmentImpl) {
                fragmentImpl = (FragmentImpl) F0;
            }
        }
        if (fragmentImpl != null) {
            fragmentImpl.a0();
        }
    }

    public final void b() {
        com.google.android.material.tabs.c cVar = this.k;
        if (cVar != null) {
            cVar.b();
        }
    }

    public final void c(ria0 ria0Var) {
        gm50.a.b(this, ria0Var.a, new px30(this, 16));
    }

    public final View getView() {
        return this.g;
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.f;
    }
}
