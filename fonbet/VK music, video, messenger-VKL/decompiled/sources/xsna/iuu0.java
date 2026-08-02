package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.ui.fave.FaveTagViewGroup;
import com.vk.dto.newsfeed.FaveTag;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: VkFeedFaveTagView.kt */
/* loaded from: classes18.dex */
public final class iuu0 extends FrameLayout {
    public final FaveTagViewGroup b;
    public izs<? super FaveTag, s3q0> c;

    public iuu0(Context context) {
        super(context, null, -1);
        LayoutInflater.from(context).inflate(R.layout.pds_fave_tag, (ViewGroup) this, true);
        this.b = (FaveTagViewGroup) findViewById(R.id.pds_ft_tag_group);
    }

    public final izs<FaveTag, s3q0> getClickByTag() {
        return this.c;
    }

    public final void setClickByTag(izs<? super FaveTag, s3q0> izsVar) {
        this.c = izsVar;
        this.b.setClickByTag(izsVar);
    }

    public final void setTags(List<FaveTag> list) {
        this.b.setTags(list);
    }
}
