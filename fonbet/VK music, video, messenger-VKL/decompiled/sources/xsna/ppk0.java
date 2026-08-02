package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.clips.design.view.nps.internal.stars.FeedbackResult;
import com.vk.core.view.components.text.VkText;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: StarsQuestionnaireView.kt */
/* loaded from: classes16.dex */
public final class ppk0 extends ConstraintLayout {
    public final VKImageView t;
    public final zn6 u;
    public final VkText v;

    public ppk0(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.internal_nps_stars_questionnaire, (ViewGroup) this, true);
        this.t = (VKImageView) findViewById(R.id.internal_nps_preview_image);
        this.u = (zn6) findViewById(R.id.internal_nps_stars_feedback);
        this.v = (VkText) findViewById(R.id.internal_nps_questionnaire_text);
    }

    public final void setFeedbackObserver(izs<? super FeedbackResult, s3q0> izsVar) {
        this.u.setFeedbackListener(izsVar);
    }
}
