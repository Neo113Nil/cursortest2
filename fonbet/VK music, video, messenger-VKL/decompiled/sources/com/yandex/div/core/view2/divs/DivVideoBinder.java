package com.yandex.div.core.view2.divs;

import android.view.View;
import com.yandex.div.core.DecodeBase64ImageTask;
import com.yandex.div.core.expression.variables.TwoWayIntegerVariableBinder;
import com.yandex.div.core.expression.variables.TwoWayVariableBinder;
import com.yandex.div.core.player.DivPlayer;
import com.yandex.div.core.player.DivPlayerFactory;
import com.yandex.div.core.player.DivPlayerPlaybackConfig;
import com.yandex.div.core.player.DivPlayerView;
import com.yandex.div.core.player.DivVideoSource;
import com.yandex.div.core.player.DivVideoViewMapper;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.ImageRepresentation;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivVideoView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivVideoScale;
import com.yandex.div2.a;
import com.yandex.div2.rd;
import java.util.List;
import java.util.concurrent.ExecutorService;
import xsna.izs;
import xsna.s3q0;

/* compiled from: DivVideoBinder.kt */
/* loaded from: classes7.dex */
public final class DivVideoBinder extends DivViewBinder<a.q, rd, DivVideoView> {
    private final DivActionBinder divActionBinder;
    private final ExecutorService executorService;
    private final DivPlayerFactory playerFactory;
    private final TwoWayIntegerVariableBinder variableBinder;
    private final DivVideoViewMapper videoViewMapper;

    public DivVideoBinder(DivBaseBinder divBaseBinder, TwoWayIntegerVariableBinder twoWayIntegerVariableBinder, DivActionBinder divActionBinder, DivVideoViewMapper divVideoViewMapper, ExecutorService executorService, DivPlayerFactory divPlayerFactory) {
        super(divBaseBinder);
        this.variableBinder = twoWayIntegerVariableBinder;
        this.divActionBinder = divActionBinder;
        this.videoViewMapper = divVideoViewMapper;
        this.executorService = executorService;
        this.playerFactory = divPlayerFactory;
    }

    private final void applyPreview(rd rdVar, ExpressionResolver expressionResolver, izs<? super ImageRepresentation, s3q0> izsVar) {
        Expression<String> expression = rdVar.B;
        String evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        if (evaluate == null) {
            izsVar.invoke(null);
        } else {
            this.executorService.submit(new DecodeBase64ImageTask(evaluate, false, izsVar));
        }
    }

    private final DivPlayer.Observer createObserver(BindingContext bindingContext, final rd rdVar, final View view) {
        final Div2View divView = bindingContext.getDivView();
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        return new DivPlayer.Observer() { // from class: com.yandex.div.core.view2.divs.DivVideoBinder$createObserver$1
        };
    }

    private final void observeElapsedTime(DivVideoView divVideoView, rd rdVar, BindingContext bindingContext, final DivPlayer divPlayer, DivStatePath divStatePath) {
        String str = rdVar.m;
        if (str == null) {
            return;
        }
        divVideoView.addSubscription(this.variableBinder.bindVariable(bindingContext, str, new TwoWayVariableBinder.Callbacks() { // from class: com.yandex.div.core.view2.divs.DivVideoBinder$observeElapsedTime$callbacks$1
            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void setViewStateChangeListener(final izs<? super Long, s3q0> izsVar) {
                DivPlayer.this.addObserver(new DivPlayer.Observer() { // from class: com.yandex.div.core.view2.divs.DivVideoBinder$observeElapsedTime$callbacks$1$setViewStateChangeListener$1
                });
            }

            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void onVariableChanged(Long l) {
                if (l != null) {
                    DivPlayer.this.seek(l.longValue());
                }
            }
        }, divStatePath));
    }

    private final void observeMuted(DivVideoView divVideoView, rd rdVar, ExpressionResolver expressionResolver, final DivPlayer divPlayer) {
        divVideoView.addSubscription(rdVar.w.observeAndGet(expressionResolver, new izs<Boolean, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivVideoBinder$observeMuted$1
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return s3q0.a;
            }

            public final void invoke(boolean z) {
                DivPlayer.this.setMuted(z);
            }
        }));
    }

    private final void observeScale(DivVideoView divVideoView, rd rdVar, ExpressionResolver expressionResolver, final DivPlayerView divPlayerView, final PreviewImageView previewImageView) {
        divVideoView.addSubscription(rdVar.G.observeAndGet(expressionResolver, new izs<DivVideoScale, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivVideoBinder$observeScale$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(DivVideoScale divVideoScale) {
                invoke2(divVideoScale);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DivVideoScale divVideoScale) {
                DivPlayerView.this.setScale(divVideoScale);
                previewImageView.setScale(divVideoScale);
            }
        }));
    }

    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(DivVideoView divVideoView, BindingContext bindingContext, rd rdVar, rd rdVar2, DivStatePath divStatePath) {
        PreviewImageView previewImageView;
        final DivPlayerView divPlayerView;
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        List<DivVideoSource> createSource = DivVideoBinderKt.createSource(rdVar, expressionResolver);
        DivPlayerPlaybackConfig divPlayerPlaybackConfig = new DivPlayerPlaybackConfig(rdVar.g.evaluate(expressionResolver).booleanValue(), rdVar.w.evaluate(expressionResolver).booleanValue(), rdVar.C.evaluate(expressionResolver).booleanValue(), rdVar.z);
        DivPlayerView playerView = divVideoView.getPlayerView();
        int childCount = divVideoView.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                previewImageView = null;
                break;
            }
            View childAt = divVideoView.getChildAt(i);
            if (childAt instanceof PreviewImageView) {
                previewImageView = (PreviewImageView) childAt;
                break;
            }
            i++;
        }
        if (playerView == null) {
            DivPlayerView makePlayerView = this.playerFactory.makePlayerView(divVideoView.getContext());
            makePlayerView.setVisibility(4);
            divPlayerView = makePlayerView;
        } else {
            divPlayerView = playerView;
        }
        final PreviewImageView previewImageView2 = previewImageView == null ? new PreviewImageView(divVideoView.getContext()) : previewImageView;
        applyPreview(rdVar, expressionResolver, new izs<ImageRepresentation, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivVideoBinder$bind$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(ImageRepresentation imageRepresentation) {
                invoke2(imageRepresentation);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ImageRepresentation imageRepresentation) {
                if (imageRepresentation != null) {
                    PreviewImageView previewImageView3 = previewImageView2;
                    previewImageView3.setVisibility(0);
                    if (imageRepresentation instanceof ImageRepresentation.PictureDrawable) {
                        previewImageView3.setImageDrawable(((ImageRepresentation.PictureDrawable) imageRepresentation).m133unboximpl());
                    } else if (imageRepresentation instanceof ImageRepresentation.Bitmap) {
                        previewImageView3.setImageBitmap(((ImageRepresentation.Bitmap) imageRepresentation).m127unboximpl());
                    }
                }
                DivPlayerView.this.setVisibility(0);
            }
        });
        DivPlayer makePlayer = this.playerFactory.makePlayer(createSource, divPlayerPlaybackConfig);
        makePlayer.addObserver(createObserver(bindingContext, rdVar, previewImageView2));
        divPlayerView.attach(makePlayer);
        observeElapsedTime(divVideoView, rdVar, bindingContext, makePlayer, divStatePath);
        observeMuted(divVideoView, rdVar, expressionResolver, makePlayer);
        DivPlayerView divPlayerView2 = divPlayerView;
        PreviewImageView previewImageView3 = previewImageView2;
        observeScale(divVideoView, rdVar, expressionResolver, divPlayerView2, previewImageView3);
        if (previewImageView == null && playerView == null) {
            divVideoView.removeAllViews();
            divVideoView.addView(divPlayerView2);
            divVideoView.addView(previewImageView3);
        }
        this.videoViewMapper.addView(divVideoView, rdVar);
        BaseDivViewExtensionsKt.bindAspectRatio(divVideoView, rdVar.f, rdVar2 != null ? rdVar2.f : null, expressionResolver);
    }
}
