package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.core.view.components.button.VkButton;
import com.vk.ecomm.market.ui.view.ratingview.DynamicRatingView;
import com.vkontakte.android.R;

/* compiled from: NotificationCSatStarsView.kt */
/* loaded from: classes4.dex */
public final class m870 extends n870 {
    public static final /* synthetic */ int g = 0;
    public final DynamicRatingView d;
    public final VkButton e;
    public boolean f;

    public m870(Context context) {
        super(context, null, 0);
        l870 l870Var = new l870();
        LayoutInflater.from(context).inflate(R.layout.csat_stars, (ViewGroup) this, true);
        View findViewById = findViewById(R.id.background);
        int i = 0;
        findViewById.setOnClickListener(new j870(i));
        findViewById.setImportantForAccessibility(2);
        ((AppCompatTextView) findViewById(R.id.tv_question)).setOnClickListener(new j870(i));
        ((AppCompatTextView) findViewById(R.id.not_interesting)).setOnClickListener(new j870(i));
        ((AppCompatTextView) findViewById(R.id.interesting)).setOnClickListener(new j870(i));
        DynamicRatingView dynamicRatingView = (DynamicRatingView) findViewById(R.id.rating);
        this.d = dynamicRatingView;
        VkButton vkButton = (VkButton) findViewById(R.id.btnSubmit);
        vkButton.setOnClickListener(new aj6(this, 8));
        this.e = vkButton;
        findViewById(R.id.hide_button).setOnClickListener(new v6d(this, 5));
        dynamicRatingView.setTouchMinRating(1.0f);
        dynamicRatingView.setLevelPaintingProvider(l870Var);
        dynamicRatingView.setOnRatingChangedListener(new k870(this));
    }
}
